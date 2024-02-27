package by.onliner.pages;

import org.openqa.selenium.By;

public class CatalogLocator {
    public static By catalogHeader = By.cssSelector(".catalog-navigation__title");
    public static By gardenAndHome = By.xpath("//li[@data-id=\"5\"]");
    public static By decorAndInterior = By.xpath("//*[@id=\"container\"]/div/div/div/div/div[1]/div[4]/div/div[7]/div[1]/div/div[10]/div[1]");
    public static By homeFlowers = By.xpath("//*[@id=\"container\"]/div/div/div/div/div[1]/div[4]/div/div[7]/div[1]/div/div[10]/div[2]/div/a[6]/span/span[2]");

}
