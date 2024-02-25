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

}
