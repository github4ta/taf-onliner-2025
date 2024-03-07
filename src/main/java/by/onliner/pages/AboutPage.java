package by.onliner.pages;

import driver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AboutPage {
    private final By COMPANY_PAGE_TITTLE_CSS = By.cssSelector("div.news-header__title>h1");
    private WebDriver driver;

    public AboutPage() {
        this.driver = Driver.getDriver();
    }

    public String getTextCompanyPageTittle() {
        return driver.findElement(COMPANY_PAGE_TITTLE_CSS).getText();
    }
}
