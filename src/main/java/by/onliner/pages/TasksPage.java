package by.onliner.pages;

import driver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.WheelInput;

public class TasksPage {
    private final String SUBSECTION_NAME = "//a[text()='Туризм']/ancestor::div[@class='service-form__collapse-header']";
    private final String HEADER_ORDERS = "//div[@class='service-header__title service-header__title_huge']";
    private final String MINSK_FILTER = "//li[@data-ng-repeat='itemId in searchFilterRegions.priorItemsIds']/label/span/span[@class='i-checkbox__faux'][1]";
    private final String SERVICES_FOR_ANIMALS = "//*[@id=\"service-list\"]/div[2]/div/div/div[2]/div[2]/div[4]/div/div[2]/div/div/div[15]/div[1]/a";
    private final String HAIRCUT_FOR_HOME_ANIMALS = "//*[@id=\"service-list\"]/div[2]/div/div/div[2]/div[2]/div[4]/div/div[2]/div/div/div[15]/div[2]/ul/li[1]/label/span/span[1]";
    private final String ACTIVE_STATUS = "//*[@id=\"service-list\"]/div[2]/div/div/div[2]/div[2]/div[5]/div/div[2]/ul/li[1]/label/span/span[1]";
    private final String FIRST_ITEM_IN_SEARCH = "//span[@class='service-offers__name ng-binding']";
    private final String TITLE = "//*[@id=\"container\"]/div/div[2]/div/div/div/div/div/div[1]/div/div/div/div[1]/div";
    private final String SCROLL_TO_SECTION_TITLE = "//div[@class='service-form__label-title' and text()='Статус']";
    private final String CHECKBOX = "//div[contains(@class,'service-form__collapse-item_opened')]//li[2]";
    private final String OFFER_ITEM = "//div[@class='service-offers__data']/a";
    private final String SERVICE_DETAIL = "//div[@class='service-summary__details-list']/a";
    private WebDriver driver;

    public TasksPage() {
        this.driver = Driver.getDriver();
    }

    public String getTextHeader() {
        return driver.findElement(By.xpath(HEADER_ORDERS)).getText();
    }

    public void clickMinsk() {
        driver.findElement(By.xpath(MINSK_FILTER)).click();
    }

    public void clickForAnimals() {
        WebElement element = driver.findElement(By.xpath(SCROLL_TO_SECTION_TITLE));
        new Actions(driver).scrollToElement(element).perform();
        driver.findElement(By.xpath(SERVICES_FOR_ANIMALS)).click();
    }

    public void clickHaircutForAnimals() {
        driver.findElement(By.xpath(HAIRCUT_FOR_HOME_ANIMALS)).click();
    }

    public void clickActiveStatus() throws InterruptedException {
        WebElement iframe = driver.findElement(By.xpath(HAIRCUT_FOR_HOME_ANIMALS));
        WheelInput.ScrollOrigin scrollOrigin = WheelInput.ScrollOrigin.fromElement(iframe);
        new Actions(driver)
                .scrollFromOrigin(scrollOrigin, 0, 300)
                .perform();
        driver.findElement(By.xpath(ACTIVE_STATUS)).click();
        Thread.sleep(1000);
    }

    public void clickFirstItemInSearch() throws InterruptedException {
        WebElement element = driver.findElement(By.xpath(HEADER_ORDERS));
        new Actions(driver).scrollToElement(element).perform();
        driver.findElement(By.xpath(FIRST_ITEM_IN_SEARCH)).click();
        Thread.sleep(2000);
    }

    public String compareTitle() {
        return driver.findElement(By.xpath(TITLE)).getText();
    }

    public void selectSectionFromList() {
        WebElement element = driver.findElement(By.xpath(SCROLL_TO_SECTION_TITLE));
        new Actions(driver).scrollToElement(element).perform();
        driver.findElement(By.xpath(SUBSECTION_NAME)).click();
    }

    public void selectCheckbox() {
        driver.findElement(By.xpath(CHECKBOX)).click();
    }

    public void selectOffer() {
        driver.findElement(By.xpath(OFFER_ITEM)).click();
    }

    public String getServiceDetailText() {
        return driver.findElement(By.xpath(SERVICE_DETAIL)).getText();
    }
}
