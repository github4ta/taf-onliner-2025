package by.onliner;

import by.onliner.pages.Baraholka;
import by.onliner.pages.BaraholkaLocator;
import by.onliner.pages.HomePage;
import by.onliner.pages.HomePageLocator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BaraholkaTest extends BaseTest {
    @Test
    public void testBaraholkaOpened() {
        HomePage homePage = new HomePage(driver);
        homePage.clickBaraholkaButton();
        Baraholka baraholka = new Baraholka(driver);
        Assertions.assertEquals("Барахолка", baraholka.getTextHeading());
    }

    @Test
    public void testLaptopsItemExists(){
        HomePage homePage=new HomePage(driver);
        homePage.clickBaraholkaButton();
        Baraholka baraholka=new Baraholka(driver);
        baraholka.clickLaptops();
        baraholka.clickBuyBtn();
        baraholka.clickFirstItem();
        String itemTitle=baraholka.getTextItemTitle();
        Assertions.assertTrue(itemTitle.contains("Ноутбук"));
    }
}
