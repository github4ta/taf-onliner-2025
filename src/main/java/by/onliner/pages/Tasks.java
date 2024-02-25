package by.onliner.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Tasks {
    private WebDriver driver;

    public Tasks(WebDriver driver) {
        this.driver = driver;
    }

    public String getTextHeader() {
        return driver.findElement(By.xpath(TasksLocator.HEADER_ORDERS)).getText();
    }
}
