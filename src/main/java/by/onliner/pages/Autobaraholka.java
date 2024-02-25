package by.onliner.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Autobaraholka {
    WebDriver driver;

    public Autobaraholka(WebDriver driver) {
        this.driver = driver;
    }

    public String getAutobaraholkaTitle() {
         return driver.findElement(By.xpath(AutobaraholkaLocator.ACTUAL_TITLE_FOR_AUTOBARAHOLKA_XPATH)).getText();
    }
}
