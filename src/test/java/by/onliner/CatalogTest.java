package by.onliner;

import by.onliner.pages.CatalogPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CatalogTest extends BaseTest{
    CatalogPage catalog;
@Test
    public void testCatalogOpened(){
    catalog = new CatalogPage(driver);
    catalog.openCatalogPage();
    String expectedCatalogHeaderText = "Каталог";
    String actualCatalogHeaderText = catalog.getCatalogPageHeader();
    Assertions.assertTrue(actualCatalogHeaderText.contains(expectedCatalogHeaderText));
}
}
