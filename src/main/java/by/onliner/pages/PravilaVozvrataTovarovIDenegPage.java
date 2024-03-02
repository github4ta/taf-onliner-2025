package by.onliner.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PravilaVozvrataTovarovIDenegPage {

    private WebDriver driver;

    public PravilaVozvrataTovarovIDenegPage(WebDriver driver) {
        this.driver = driver;
    }

    private static final String NEWS_HEADER_TITLE = "//div[@class='news-header__title']";
    private static final String FIELD_NAME = "//label[@for='id_name']";
    private static final String FIELD_EMAIL = "//label[@for='id_email']";
    private static final String FIELD_TYPE_OF_PROBLEM = "//label[@for='id_type']";
    private static final String FIELD_WHERE = "//label[@for='id_project']";
    private static final String FIELD_SHORT_DESCRIPTION = "//label[@for='id_subject']";
    private static final String FIELD_DETAILED_DESCRIPTION = "//label[@for='id_description']";
    private static final String FIELD_CAPTCHA = "//label[@for='id_captcha']";

    public String getTextHeader() {
        return driver.findElement(By.xpath(NEWS_HEADER_TITLE)).getText();
    }

    public String getTextFieldName() {
        return driver.findElement(By.xpath(FIELD_NAME)).getText();
    }

    public String getTextFieldEmail() {
        return driver.findElement(By.xpath(FIELD_EMAIL)).getText();
    }

    public String getTextFieldTypeOfProblem() {
        return driver.findElement(By.xpath(FIELD_TYPE_OF_PROBLEM)).getText();
    }

    public String getTextFieldWhere() {
        return driver.findElement(By.xpath(FIELD_WHERE)).getText();
    }

    public String getTextFieldShortDescription() {
        return driver.findElement(By.xpath(FIELD_SHORT_DESCRIPTION)).getText();

    }

    public String getTextFieldDetailedDescription() {
        return driver.findElement(By.xpath(FIELD_DETAILED_DESCRIPTION)).getText();

    }

    public String getTextFieldCaptcha() {
        return driver.findElement(By.xpath(FIELD_CAPTCHA)).getText();

    }

}
