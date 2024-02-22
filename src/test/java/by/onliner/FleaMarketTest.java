package by.onliner;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FleaMarketTest {
    @Test
    public void testFleaMarket(){
        ChromeDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        final String URL="https://www.onliner.by/";
        driver.get(URL);
        final By FLEA_MARKET_BUTTON_XPATH=By.xpath("//a[@href=\"https://baraholka.onliner.by/\"]");
        final By HEADING_XPATH=By.xpath("//h1[@class=\"m-title-i\"]");
        driver.findElement(FLEA_MARKET_BUTTON_XPATH).click();
        Assertions.assertEquals("Барахолка",driver.findElement(HEADING_XPATH).getText());
        driver.quit();
    }
}
