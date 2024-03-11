package by.onliner.pages;

import driver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ContactsPage {
    private final String CONTACTS_HOME_PAGE_XPATH = "//div[@class='news-header__title']";
    private final String EMAIL_OF_ONLINER = "//div[@class='news-text']/p[7]/strong/a";
    private WebDriver driver;

    public ContactsPage() {
        this.driver = Driver.getDriver();
    }

    public String getEmailOfOnliner() {
        return driver.findElement(By.xpath(EMAIL_OF_ONLINER)).getText();
    }

    public String getCONTACTS_HOME_PAGE_XPATH() {
        return driver.findElement(By.xpath(CONTACTS_HOME_PAGE_XPATH)).getText();
    }
}
