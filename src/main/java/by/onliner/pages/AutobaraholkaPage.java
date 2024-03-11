package by.onliner.pages;

import driver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AutobaraholkaPage {
    private final String ACTUAL_TITLE_FOR_AUTOBARAHOLKA_XPATH = "//h1[@class='vehicle-form__title vehicle-form__title_big-alter']";
    private final String ALL_COUNTRY_FIELD_XPATH = "//div[@class='vehicle-form__row']/div[1]//div[2]/div[1]/div[1]/div[1]/div[1]";
    private final String ALL_COUNTRY_FIELD_VALUE_XPATH = "//div[@class='dropdown-style__container']//div[text()='";
    private final String ALL_AREA_FIELD_XPATH = "//div[@class='vehicle-form__row']/div[1]//div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]//div[2]";
    private final String ALL_AREA_FIELD_VALUE_XPATH = "//div[@class='dropdown-style__container']//div[text()='";
    private final String ALL_CITY_FIELD_XPATH = "//div[@class='vehicle-form__row']/div[1]/div[2]/div[1]/div[1]/div[1]/div[3]";
    private final String ALL_CITY_FIELD_VALUE_XPATH = "//div[@class='dropdown-style__container']//div[text()='";
    private final String BRAND_FIELD_XPATH = "//div[@class='vehicle-form__filter-overflow js-results-container']/div[2]/div[2]//div[@class='vehicle-form__field']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]";
    private final String BRAND_FIELD_VALUE_XPATH = "//div[@class='dropdown-style__container']//div[text()='";
    private final String FIRST_VEHICLE_FORM_XPATH = "//div[@class='vehicle-form__offers-list']/a[1]";
    private final String VEHICLE_FORM_TITLE = "//h1[@class='vehicle-form__title vehicle-form__title_big-alter vehicle-form__title_condensed-other']";
    WebDriver driver;

    public AutobaraholkaPage() {
        this.driver = Driver.getDriver();
    }

    public String getAutobaraholkaTitle() {
        return driver.findElement(By.xpath(ACTUAL_TITLE_FOR_AUTOBARAHOLKA_XPATH)).getText();
    }

    public void clickAllCountry() {
        driver.findElement(By.xpath(ALL_COUNTRY_FIELD_XPATH)).click();
    }

    public void clickNecessaryCountry(String country) {
        String necessaryCountry = ALL_COUNTRY_FIELD_VALUE_XPATH + country + "']";
        driver.findElement(By.xpath(necessaryCountry)).click();
    }

    public void clickAllArea() {
        driver.findElement(By.xpath(ALL_AREA_FIELD_XPATH)).click();
    }

    public void clickNecessaryArea(String area) {
        String necessaryArea = ALL_AREA_FIELD_VALUE_XPATH + area + "']";
        driver.findElement(By.xpath(necessaryArea)).click();
    }

    public void clickAllCity() {
        driver.findElement(By.xpath(ALL_CITY_FIELD_XPATH)).click();
    }

    public void clickNecessaryCity(String city) {
        String necessaryCity = ALL_CITY_FIELD_VALUE_XPATH + city + "']";
        driver.findElement(By.xpath(necessaryCity)).click();
    }

    public void clickBrand() {
        driver.findElement(By.xpath(BRAND_FIELD_XPATH)).click();
    }

    public void clickNecessaryBrand(String brand) {
        String necessaryBrand = BRAND_FIELD_VALUE_XPATH + brand + "']";
        driver.findElement(By.xpath(necessaryBrand)).click();
    }

    public void clickFirstLine() {
        driver.findElement(By.xpath(FIRST_VEHICLE_FORM_XPATH)).click();
    }

    public String getTextItemTitle() {
        return driver.findElement(By.xpath(VEHICLE_FORM_TITLE)).getText();
    }
}
