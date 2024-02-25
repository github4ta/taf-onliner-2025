package by.onliner.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HousePlantsPage {
    WebDriver driver;

    public HousePlantsPage(WebDriver driver) {
        this.driver = driver;
    }
    public String getHousePlantsHeader (){
        driver.findElement(By.xpath(HouseplantsLocators.HOUSEPLANTS_HEADER)).click();
    }
}
