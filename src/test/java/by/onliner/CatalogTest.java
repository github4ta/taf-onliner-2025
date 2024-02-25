package by.onliner;

import by.onliner.pages.Catalog;
import by.onliner.pages.CatalogLocator;
import by.onliner.pages.HomePageLocator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CatalogTest extends BaseTest{
    Catalog catalog;
@Test
    public void testCatalogOpened(){
    catalog = new Catalog(driver);
    catalog.openCatalogPage();
    String expectedCatalogHeaderText = "Каталог";
    String actualCatalogHeaderText = catalog.getCatalogPageHeader();
    Assertions.assertTrue(actualCatalogHeaderText.contains(expectedCatalogHeaderText));
}
}
