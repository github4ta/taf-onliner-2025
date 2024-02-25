package by.onliner;

import by.onliner.pages.Autobaraholka;
import by.onliner.pages.AutobaraholkaLocator;
import by.onliner.pages.HomePageLocator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

public class AutobaraholkaTest extends BaseTest{
    @Test
    public void testAutobaraholkaOpened() {
        Autobaraholka autobaraholka = new Autobaraholka(driver);
        driver.findElement(By.xpath(HomePageLocator.AUTOBARAHOLKA_XPATH)).click();
        Assertions.assertEquals("Автобарахолка", autobaraholka.getAutobaraholkaTitle());
    }
}
