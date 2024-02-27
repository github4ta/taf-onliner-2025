package by.onliner.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static by.onliner.pages.ReturnPolicyLocator.NEWS_HEADER_TITLE;

public class ReturnPolicy {

    WebDriver driver;

    public ReturnPolicy(WebDriver driver) {
        this.driver = driver;
    }

    public String getTextHeader() {
        return driver.findElement(By.xpath(ReturnPolicyLocator.NEWS_HEADER_TITLE)).getText();
    }

    public String getTextFieldName() {
        return driver.findElement(By.xpath(ReturnPolicyLocator.FIELD_NAME)).getText();
    }

    public String getTextFieldEmail() {
        return driver.findElement(By.xpath(ReturnPolicyLocator.FIELD_EMAIL)).getText();
    }

    public String getTextFieldTypeOfProblem() {
        return driver.findElement(By.xpath(ReturnPolicyLocator.FIELD_TYPE_OF_PROBLEM)).getText();
    }

    public String getTextFieldWhere() {
        return driver.findElement(By.xpath(ReturnPolicyLocator.FIELD_WHERE)).getText();
    }

    public String getTextFieldShortDescription() {
        return driver.findElement(By.xpath(ReturnPolicyLocator.FIELD_SHORT_DESCRIPTION)).getText();

    }

    public String getTextFieldDetailedDescription() {
        return driver.findElement(By.xpath(ReturnPolicyLocator.FIELD_DETAILED_DESCRIPTION)).getText();

    }

    public String getTextFieldCaptcha() {
        return driver.findElement(By.xpath(ReturnPolicyLocator.FIELD_CAPTCHA)).getText();

    }

}
