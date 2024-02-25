package by.onliner.pages;

import org.openqa.selenium.By;

public class BaraholkaLocator {
    public static final By HEADING_XPATH = By.xpath("//h1[@class=\"m-title-i\"]");
    public static final By LAPTOPS_XPATH = By.xpath("//a[text()='Ноутбуки']");
    public static final By BUY_BTN_XPATH = By.xpath("//a[text()='Куплю']");
    public static final By FIRST_ITEM_XPATH = By.xpath("//tr[@class='m-imp']//a");
    public static final By ITEM_TITLE=By.xpath("//h1[@class='m-title-i title']");
}
