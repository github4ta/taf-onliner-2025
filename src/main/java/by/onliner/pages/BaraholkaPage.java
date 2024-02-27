package by.onliner.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BaraholkaPage {
    private final By HEADING_XPATH = By.xpath("//h1[@class=\"m-title-i\"]");
    private final By LAPTOPS_XPATH = By.xpath("//a[text()='Ноутбуки']");
    private final By BUY_BTN_XPATH = By.xpath("//a[text()='Куплю']");
    private final By FIRST_ITEM_XPATH = By.xpath("//tr[@class='m-imp']//a");
    private final By ITEM_TITLE = By.xpath("//h1[@class='m-title-i title']");

    private WebDriver driver;

    public BaraholkaPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getTextHeading() {
        return driver.findElement(HEADING_XPATH).getText();
    }

    public void clickLaptops() {
        driver.findElement(LAPTOPS_XPATH).click();
    }

    public void clickBuyBtn() {
        driver.findElement(BUY_BTN_XPATH).click();
    }

    public void clickFirstItem() {
        driver.findElement(FIRST_ITEM_XPATH).click();
    }

    public String getTextItemTitle() {
        return driver.findElement(ITEM_TITLE).getText();
    }

}
