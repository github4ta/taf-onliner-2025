package by.onliner.pages;

import driver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
    WebDriver driver;

    public HomePage() {
        this.driver = Driver.getDriver();
    }

    private final String CATALOG_BTN = ".b-top-menu a[href='https://catalog.onliner.by']";
    private final String TWENTY_FOUR_HOURS_NEWS_XPATH = "//a[text()='Новое за 24 часа']";
    private final String CATALOG_ITEM = ".b-top-menu a[href='https://catalog.onliner.by']";

    public void openForum() {
        driver.findElement(By.xpath(HomePageLocator.FORUM_XPATH)).click();
    }

    public void clickPolicy() {
        driver.findElement(By.xpath(HomePageLocator.PERSONAL_DATA_XPATH)).click();
    }

    public void clickServiceSection() {
        driver.findElement(By.xpath(HomePageLocator.SERVICE_SECTION)).click();
    }

    public void vacancyBtnClick() {
        driver.findElement(By.xpath(HomePageLocator.VACANCY_BTN)).click();
    }

    public void clickBaraholkaButton() {
        driver.findElement(HomePageLocator.BARAHOLKA_BUTTON_XPATH).click();
    }

    public void openAboutCompanyPage() {
        driver.findElement(By.xpath(HomePageLocator.aboutCompanyLinkXPath)).click();
    }

    public void contactsClick() {
        driver.findElement(By.xpath(HomePageLocator.CONTACTS_XPATH)).click();
    }

    public void clickReturnPolicy() {
        driver.findElement(By.xpath(HomePageLocator.RETURN_POLICY)).click();
    }

    public String getCopyrightsText() {
        return driver.findElement(By.cssSelector(HomePageLocator.COPYRIGHTS)).getText();
    }

    public void clickAutobaraholkaBtn() {
        driver.findElement(By.xpath(HomePageLocator.AUTOBARAHOLKA_XPATH)).click();
    }

    public void clickTwentyFourHoursNews() {
        driver.findElement(By.xpath(TWENTY_FOUR_HOURS_NEWS_XPATH)).click();
    }

    public void openCatalogItem() {
        driver.findElement(By.cssSelector(CATALOG_ITEM)).click();
    }

    public void openCatalogPage() {
        driver.findElement(By.cssSelector(CATALOG_BTN)).click();
    }

    public void clickUserSupport() {
        driver.findElement(By.xpath(HomePageLocator.BTN_USER_SUPPORT)).click();
    }
}
