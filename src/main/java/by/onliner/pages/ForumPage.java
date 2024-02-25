package by.onliner.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ForumPage {
    WebDriver driver;

    public ForumPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getText() {
        WebElement text = driver.findElement(By.xpath(ForumLocator.TITLE_XPATH));
        return text.getText();
    }

    public String getTextFirstElementInListImportantSection() {
        return driver.findElement(ForumLocator.FIRST_ELEMENT_IN_LIST_IMPORTANT_SECTION_CSS).getText();
    }

    public void clickFirstElementInListImportantSection() {
        driver.findElement(ForumLocator.FIRST_ELEMENT_IN_LIST_IMPORTANT_SECTION_CSS).click();
    }

    public String getTextHeadingFirstElementInListImportantSection() {
        return driver.findElement(ForumLocator.HEADING_FIRST_ELEMENT_IN_LIST_IMPORTANT_SECTION_CSS).getText();
    }
}
