package by.onliner;

import by.onliner.pages.CatalogLocator;
import by.onliner.pages.HomePageLocator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CatalogTest extends BaseTest{
@Test
    public void testCatalogOpened(){
    driver.findElement(HomePageLocator.CATALOG_BTN).click();
    String expectedCatalogHeaderText = "Каталог";
    String actualCatalogHeaderText = driver.findElement(CatalogLocator.catalogHeader).getText();
    Assertions.assertTrue(actualCatalogHeaderText.contains(expectedCatalogHeaderText));
}
}
