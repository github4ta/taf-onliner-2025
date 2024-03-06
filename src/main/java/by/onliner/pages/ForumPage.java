package by.onliner.pages;

import driver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ForumPage {
    private WebDriver driver;

    public ForumPage() {
        this.driver = Driver.getDriver();
    }

    private final String TITLE_XPATH = "//h1[@class='m-title']";
    private final By FIRST_ELEMENT_IN_LIST_IMPORTANT_SECTION_CSS = By.cssSelector("div.h-hottopics>ul>li:nth-child(1)>h3>a");
    private final By HEADING_FIRST_ELEMENT_IN_LIST_IMPORTANT_SECTION_CSS = org.openqa.selenium.By.cssSelector("h1.m-title>a");


    public String getText() {
        WebElement text = driver.findElement(By.xpath(TITLE_XPATH));
        return text.getText();
    }

    public String getTextFirstElementInListImportantSection() {
        return driver.findElement(FIRST_ELEMENT_IN_LIST_IMPORTANT_SECTION_CSS).getText();
    }

    public void clickFirstElementInListImportantSection() {
        driver.findElement(FIRST_ELEMENT_IN_LIST_IMPORTANT_SECTION_CSS).click();
    }

    public String getTextHeadingFirstElementInListImportantSection() {
        return driver.findElement(HEADING_FIRST_ELEMENT_IN_LIST_IMPORTANT_SECTION_CSS).getText();
    }
}
