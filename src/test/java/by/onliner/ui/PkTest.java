package by.onliner.ui;

import by.onliner.pages.CatalogPage;
import by.onliner.pages.HomePage;
import by.onliner.pages.PkPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PkTest extends BaseTest{
    @Test
    public void testPkOpened() {
        HomePage homePage = new HomePage();
        homePage.openCatalogItem();
        CatalogPage catalog = new CatalogPage();
      //  catalog.acceptPrivacyPolicy();
        catalog.clickGardenAndHomeMenu();
        catalog.clickDecorAndInteriorItem();
        catalog.clickHouseFlowersItem();
        PkPage pkPage = new PkPage();
        Assertions.assertTrue(pkPage.getHousePlantsHeader().contains("Комнатные растения, флорариумы"));
    }
}
