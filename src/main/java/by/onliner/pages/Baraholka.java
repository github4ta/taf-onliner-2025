package by.onliner.pages;

import org.openqa.selenium.WebDriver;

public class Baraholka {
    private WebDriver driver;

    public Baraholka(WebDriver driver) {
        this.driver = driver;
    }

    public String getTextHeading() {
        return driver.findElement(BaraholkaLocator.HEADING_XPATH).getText();
    }
}
