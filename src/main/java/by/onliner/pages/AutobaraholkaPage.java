package by.onliner.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class AutobaraholkaPage {
    WebDriver driver;

    public AutobaraholkaPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getAutobaraholkaTitle() {
        return driver.findElement(By.xpath(AutobaraholkaLocator.ACTUAL_TITLE_FOR_AUTOBARAHOLKA_XPATH)).getText();
    }

    public void clickAllCountry() {
        driver.findElement(By.xpath(AutobaraholkaLocator.ALL_COUNTRY_FIELD_XPATH)).click();
    }

    public void clickNecessaryCountry() {
        driver.findElement(By.xpath(AutobaraholkaLocator.ALL_COUNTRY_FIELD_VALUE_XPATH)).click();
    }

    public void clickAllArea() {
        driver.findElement(By.xpath(AutobaraholkaLocator.ALL_AREA_FIELD_XPATH)).click();
    }

    public void clickNecessaryArea() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.xpath(AutobaraholkaLocator.ALL_AREA_FIELD_VALUE_XPATH)).click();
    }

    public void clickAllCity() {
        driver.findElement(By.xpath(AutobaraholkaLocator.ALL_CITY_FIELD_XPATH)).click();
    }

    public void clickNecessaryCity() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.xpath(AutobaraholkaLocator.ALL_CITY_FIELD_VALUE_XPATH)).click();
    }

    public void clickBrand() {
        driver.findElement(By.xpath(AutobaraholkaLocator.BRAND_FIELD_XPATH)).click();
    }

    public void clickNecessaryBrand(String brand) {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        String necessaryBrand = AutobaraholkaLocator.BRAND_FIELD_VALUE_XPATH + brand + "']";
        driver.findElement(By.xpath(necessaryBrand)).click();
    }

    public void clickFirstLine() {
        driver.findElement(By.xpath(AutobaraholkaLocator.FIRST_VEHICLE_FORM_XPATH)).click();
    }

    public String getTextItemTitle() {
        return driver.findElement(By.xpath(AutobaraholkaLocator.VEHICLE_FORM_TITLE)).getText();
    }
}
