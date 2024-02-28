package by.onliner.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AboutPage {
    private final By COMPANY_PAGE_TITTLE_CSS = By.cssSelector("div.news-header__title>h1");
    private WebDriver driver;

    public AboutPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getTextCompanyPageTittle() {
        return driver.findElement(COMPANY_PAGE_TITTLE_CSS).getText();
    }
}
