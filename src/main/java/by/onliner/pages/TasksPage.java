package by.onliner.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class TasksPage {
    public static final String SUBSECTION_NAME = "//a[text()='??????']/ancestor::div[@class='service-form__collapse-header']";
    public static final String HEADER_ORDERS = "//div[@class='service-header__title service-header__title_huge']";
    public static final String MINSK_FILTER = "//li[@data-ng-repeat='itemId in searchFilterRegions.priorItemsIds']/label/span/span[@class='i-checkbox__faux'][1]";
    public static final String SERVICES_FOR_ANIMALS = "//*[@id=\"service-list\"]/div[2]/div/div/div[2]/div[2]/div[4]/div/div[2]/div/div/div[15]/div[1]/a";
    public static final String HAIRCUT_FOR_HOME_ANIMALS = "//*[@id=\"service-list\"]/div[2]/div/div/div[2]/div[2]/div[4]/div/div[2]/div/div/div[15]/div[2]/ul/li[1]/label/span/span[1]";
    public static final String ACTIVE_STATUS = "//*[@id=\"service-list\"]/div[2]/div/div/div[2]/div[2]/div[5]/div/div[2]/ul/li[1]/label/span/span[1]";
    public static final String FIRST_ITEM_IN_SEARCH = "//*[@id=\"service-list\"]/div[2]/div/div/div[3]/search-tasks-list/div/div/div[1]/search-tasks-item/div/div/div[1]/div/a/span[2]/span[1]";
    public static final String TITLE = "//*[@id=\"container\"]/div/div[2]/div/div/div/div/div/div[1]/div/div/div/div[1]/div";
    public static final String SCROLL_TO_SECTION_TITLE = "//div[@class='service-form__label-title' and text()='??????']";
    public static final String CHECKBOX = "//div[contains(@class,'service-form__collapse-item_opened')]//li[2]";
    public static final String OFFER_ITEM = "//div[@class='service-offers__data']/a";
    public static final String SERVICE_DETAIL = "//div[@class='service-summary__details-list']/a";
    private WebDriver driver;

    public TasksPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getTextHeader() {
        return driver.findElement(By.xpath(HEADER_ORDERS)).getText();
    }

    public void clickMinsk() throws InterruptedException {
        driver.findElement(By.xpath(MINSK_FILTER)).click();
        Thread.sleep(20000);
    }

    public void clickForAnimals() throws InterruptedException {
        driver.findElement(By.xpath(SERVICES_FOR_ANIMALS)).click();
        Thread.sleep(20000);
    }

    public void clickHaircutForAnimals() throws InterruptedException{
        driver.findElement(By.xpath(HAIRCUT_FOR_HOME_ANIMALS)).click();
        Thread.sleep(20000);
    }

    public void clickActiveStatus() throws InterruptedException{
        driver.findElement(By.xpath(ACTIVE_STATUS)).click();
        Thread.sleep(20000);
    }

    public void clickFirstItemInSearch() {
        driver.findElement(By.xpath(FIRST_ITEM_IN_SEARCH)).click();
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
