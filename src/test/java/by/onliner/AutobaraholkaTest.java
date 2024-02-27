package by.onliner;

import by.onliner.pages.AutobaraholkaPage;
import by.onliner.pages.HomePage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

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
        autobaraholka.clickNecessaryCountry();
        autobaraholka.clickAllArea();
        autobaraholka.clickNecessaryArea();
        autobaraholka.clickAllCity();
        autobaraholka.clickNecessaryCity();
        autobaraholka.clickBrand();
        autobaraholka.clickNecessaryBrand("Acura");

        autobaraholka.clickFirstLine();
        String itemTitle = autobaraholka.getTextItemTitle();
        Assertions.assertTrue(itemTitle.contains("Acura"));
    }
}
