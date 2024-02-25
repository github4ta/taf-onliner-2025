package by.onliner.pages;

import org.openqa.selenium.WebDriver;

public class Catalog {
    WebDriver driver;

    public Catalog(WebDriver driver) {
        this.driver = driver;
    }

    public void openCatalogPage(){
        driver.findElement(HomePageLocator.CATALOG_BTN).click();
    }
}
