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

    public void clickLaptops(){
        driver.findElement(BaraholkaLocator.LAPTOPS_XPATH).click();
    }

    public void clickBuyBtn(){
        driver.findElement(BaraholkaLocator.BUY_BTN_XPATH).click();
    }

    public void clickFirstItem(){
        driver.findElement(BaraholkaLocator.FIRST_ITEM_XPATH).click();
    }

    public String getTextItemTitle(){
       return driver.findElement(BaraholkaLocator.ITEM_TITLE).getText();
    }
}
