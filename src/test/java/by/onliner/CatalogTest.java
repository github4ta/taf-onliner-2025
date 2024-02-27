package by.onliner;

import by.onliner.pages.CatalogPage;
import by.onliner.pages.HomePage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CatalogTest extends BaseTest{
    CatalogPage catalog;
@Test
    public void testCatalogOpened(){
    HomePage homePage =new HomePage(driver);
    homePage.openCatalogPage();
    CatalogPage catalogPage = new CatalogPage(driver);
    catalogPage.getCatalogPageHeader();
    String expectedCatalogHeaderText = "Каталог";
    String actualCatalogHeaderText = catalog.getCatalogPageHeader();
    Assertions.assertTrue(actualCatalogHeaderText.contains(expectedCatalogHeaderText));
}
}
