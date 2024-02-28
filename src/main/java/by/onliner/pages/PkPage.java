package by.onliner.pages;

import by.onliner.driver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PkPage {
    private WebDriver driver;

    public PkPage() {
        this.driver = Driver.getDriver();
    }

    public static final String LOCATION_POP_UP = "//span[@class='button-style button-style_primary button-style_small-alter catalog-form__button']";
    public static final String HOUSEPLANTS_HEADER = "//h1[@class=\"catalog-form__title catalog-form__title_big-alter\"]";


    public String getHousePlantsHeader() {
        return driver.findElement(By.xpath(HOUSEPLANTS_HEADER)).getText();
    }
}
