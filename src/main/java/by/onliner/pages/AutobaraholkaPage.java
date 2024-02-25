package by.onliner.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AutobaraholkaPage {
    WebDriver driver;

    public AutobaraholkaPage(WebDriver driver) {
        this.driver = driver;
    }
    public void clickAutobaraholkaBtn(){
        driver.findElement(By.xpath(HomePageLocator.AUTOBARAHOLKA_XPATH)).click();
    }
    public String getAutobaraholkaTitle() {
         return driver.findElement(By.xpath(AutobaraholkaLocator.ACTUAL_TITLE_FOR_AUTOBARAHOLKA_XPATH)).getText();
    }
}
