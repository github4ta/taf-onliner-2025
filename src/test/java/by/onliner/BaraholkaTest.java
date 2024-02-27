package by.onliner;

import by.onliner.pages.BaraholkaPage;
import by.onliner.pages.HomePage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BaraholkaTest extends BaseTest {
    @Test
    public void testBaraholkaOpened() {
        HomePage homePage = new HomePage(driver);
        homePage.clickBaraholkaButton();
        BaraholkaPage baraholka = new BaraholkaPage(driver);
        Assertions.assertEquals("Барахолка", baraholka.getTextHeading());
    }

    @Test
    public void testLaptopsItemExists(){
        HomePage homePage=new HomePage(driver);
        homePage.clickBaraholkaButton();
        BaraholkaPage baraholka=new BaraholkaPage(driver);
        baraholka.clickLaptops();
        baraholka.clickBuyBtn();
        baraholka.clickFirstItem();
        String itemTitle=baraholka.getTextItemTitle();
        Assertions.assertTrue(itemTitle.contains("Ноутбук"));
    }
}
