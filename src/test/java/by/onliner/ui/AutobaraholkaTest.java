package by.onliner.ui;

import by.onliner.pages.AutobaraholkaPage;
import by.onliner.pages.HomePage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AutobaraholkaTest extends BaseTest{

    @Test
    public void testAutobaraholkaOpened() {
        AutobaraholkaPage autobaraholka = new AutobaraholkaPage(driver);
        HomePage hp = new HomePage(driver);
        hp.clickAutobaraholkaBtn();
        autobaraholka.getAutobaraholkaTitle();
        Assertions.assertEquals("Автобарахолка", autobaraholka.getAutobaraholkaTitle());
    }

    @Test
    public void testCorrectCity() {
        AutobaraholkaPage autobaraholka = new AutobaraholkaPage(driver);
        HomePage homePage = new HomePage(driver);
        homePage.clickAutobaraholkaBtn();
        autobaraholka.clickAllCountry();
        autobaraholka.clickNecessaryCountry("Беларусь");
        autobaraholka.clickAllArea();
        autobaraholka.clickNecessaryArea("Минская обл.");
        autobaraholka.clickAllCity();
        autobaraholka.clickNecessaryCity("Минск");
        autobaraholka.clickBrand();
        autobaraholka.clickNecessaryBrand("Acura");

        autobaraholka.clickFirstLine();
        String itemTitle = autobaraholka.getTextItemTitle();
        Assertions.assertTrue(itemTitle.contains("Acura"));
    }
}