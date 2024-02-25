package by.onliner;

import by.onliner.pages.AutobaraholkaLocator;
import by.onliner.pages.HomePageLocator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

public class AutobaraholkaTest extends BaseTest{
    @Test
    public void testAutobaraholkaOpened() {
        driver.findElement(By.xpath(HomePageLocator.AUTOBARAHOLKA_XPATH)).click();
        Assertions.assertEquals("Автобарахолка", driver.findElement(By.xpath(AutobaraholkaLocator.ACTUAL_TITLE_FOR_AUTOBARAHOLKA_XPATH)).getText());
    }
}
