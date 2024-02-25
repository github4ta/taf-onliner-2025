package by.onliner.pages;

import org.openqa.selenium.WebDriver;

public class Catalog {
    WebDriver driver;

    public Catalog(WebDriver driver) {
        this.driver = driver;
    }

    public void openCatalogPage() {
        driver.findElement(HomePageLocator.CATALOG_BTN).click();
    }

    public String getCatalogPageHeader() {
        String headerText = driver.findElement(CatalogLocator.catalogHeader).getText();
        return headerText;
    }

    public void clickGardenAndHomeMenu() {
        driver.findElement(CatalogLocator.gardenAndHome).click();
    }
    public void clickdecorAndInteriorItem(){
        driver.findElement(CatalogLocator.decorAndInterior).click();
    }
    public void clickhomeFlowersItem(){
        driver.findElement(CatalogLocator.homeFlowers).click();
    }
}
