package by.onliner;

import by.onliner.pages.BaraholkaLocator;
import by.onliner.pages.HomePageLocator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BaraholkaTest extends BaseTest {
    @Test
    public void testBaraholkaOpened() {
        driver.findElement(HomePageLocator.BARAHOLKA_BUTTON_XPATH).click();
        Assertions.assertEquals("Барахолка", driver.findElement(BaraholkaLocator.HEADING_XPATH).getText());
    }
}
