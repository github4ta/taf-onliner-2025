package by.onliner.pages;

import org.openqa.selenium.By;

public class CatalogLocator {
    public static By catalogHeader = By.cssSelector(".catalog-navigation__title");
    public static By gardenAndHome = By.cssSelector(".catalog-navigation-classifier__item-icon catalog-navigation-classifier__item-icon_id_5");
    public static By decorAndInterior = By.xpath("//div[@class ='catalog-navigation-list__aside-item catalog-navigation-list__aside-item_active']");
    public static By homeFlowers = By.xpath("//span[@style ='catalog-navigation-list__dropdown-preview']");

}
