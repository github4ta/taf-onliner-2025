package by.onliner;

import by.onliner.pages.CatalogPage;
import by.onliner.pages.HomePage;
import by.onliner.pages.HousePlantsPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FlowersTest extends BaseTest{
    @Test
    public void testContainsFlowersHeader() {
        HomePage homePage = new HomePage(driver);
        homePage.openCatalogItem();
        CatalogPage catalog = new CatalogPage(driver);
        catalog.clickGardenAndHomeMenu();
        catalog.clickDecorAndInteriorItem();
        catalog.clickHouseFlowersItem();
        HousePlantsPage housePlantsPage = new HousePlantsPage(driver);
        Assertions.assertTrue(housePlantsPage.getHousePlantsHeader().contains("Комнатные растения, флорариумы"));
    }
}
