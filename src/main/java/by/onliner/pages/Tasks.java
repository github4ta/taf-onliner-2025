package by.onliner.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import static by.onliner.pages.TasksLocator.*;

public class Tasks {
    private WebDriver driver;

    public Tasks(WebDriver driver) {
        this.driver = driver;
    }

    public String getTextHeader() {
        return driver.findElement(By.xpath(TasksLocator.HEADER_ORDERS)).getText();
    }

    public void selectSectionFromList() {
        WebElement element = driver.findElement(By.xpath(SCROLL_TO_SECTION_TITLE));
        new Actions(driver).scrollToElement(element).perform();
        driver.findElement(By.xpath(SUBSECTION_NAME)).click();
    }

    public void selectCheckbox() {
        driver.findElement(By.xpath(CHECKBOX)).click();
    }

    public void selectOffer() {
        driver.findElement(By.xpath(OFFER_ITEM)).click();
    }

    public String getServiceDetailText() {
        return driver.findElement(By.xpath(SERVICE_DETAIL)).getText();
    }
}
