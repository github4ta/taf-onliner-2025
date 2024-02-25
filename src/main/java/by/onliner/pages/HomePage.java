package by.onliner.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static by.onliner.pages.HomePageLocator.COPYRIGHTS;

public class HomePage {
    private WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public String getCopyrightsText() {
        return driver.findElement(By.cssSelector(COPYRIGHTS)).getText();
    }
}
