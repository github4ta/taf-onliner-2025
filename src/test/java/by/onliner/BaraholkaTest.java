package by.onliner;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

public class BaraholkaTest extends BaseTest{
    @Test
    public void testBaraholkaOpened() {
        final By FLEA_MARKET_BUTTON_XPATH = By.xpath("//a[@href=\"https://baraholka.onliner.by/\"]");
        final By HEADING_XPATH = By.xpath("//h1[@class=\"m-title-i\"]");
        driver.findElement(FLEA_MARKET_BUTTON_XPATH).click();
        Assertions.assertEquals("Барахолка", driver.findElement(HEADING_XPATH).getText());
    }
}
