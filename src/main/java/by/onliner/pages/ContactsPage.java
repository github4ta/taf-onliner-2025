package by.onliner.pages;

import driver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ContactsPage {
    private final String CONTACTS_HOME_PAGE_XPATH = "/div[@class=\"news-header__title\"]";
    private final String CONTACTS_OF_EDITORIAL_OFFICE = "//div[@class='footer-style__part footer-style__part_1']/ul/li[2]/a";
    private final String EMAIL_OF_ONLINER = "//div[@class='news-text']/p[7]/strong/a";
    private WebDriver driver;
    public ContactsPage() {
        this.driver = Driver.getDriver();
    }

    public ContactsPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getEmailOfOnliner() {
        return driver.findElement(By.xpath(EMAIL_OF_ONLINER)).getText();
    }

    public String getCONTACTS_HOME_PAGE_XPATH() {
        return CONTACTS_HOME_PAGE_XPATH;
    }

    public String getCONTACTS_OF_EDITORIAL_OFFICE() {
        return CONTACTS_OF_EDITORIAL_OFFICE;
    }

    public String getEMAIL_OF_ONLINER() {
        return EMAIL_OF_ONLINER;
    }
    public void clickContactsOfEditorialOffice () {
        driver.findElement(By.xpath(CONTACTS_OF_EDITORIAL_OFFICE)).click();;
    }
}
