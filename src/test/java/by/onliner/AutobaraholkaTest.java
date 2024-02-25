package by.onliner;

import by.onliner.pages.AutobaraholkaPage;
import by.onliner.pages.HomePage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

public class AutobaraholkaTest extends BaseTest{

    @Test
    public void testAutobaraholkaOpened() {
        AutobaraholkaPage autobaraholka = new AutobaraholkaPage(driver);
        HomePage hp = new HomePage(driver);
        hp.clickAutobaraholkaBtn();
        autobaraholka.getAutobaraholkaTitle();
        Assertions.assertEquals("Автобарахолка", autobaraholka.getAutobaraholkaTitle());
    }
}
