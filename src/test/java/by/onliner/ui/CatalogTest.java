package by.onliner.ui;

import by.onliner.pages.CatalogPage;
import by.onliner.pages.HomePage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CatalogTest extends BaseTest{

@Test
    public void testCatalogOpened(){
    HomePage homePage =new HomePage();
    homePage.openCatalogPage();
    CatalogPage catalogPage = new CatalogPage();
    Assertions.assertTrue(catalogPage.getCatalogPageHeader().contains("Каталог"));
  }
}
