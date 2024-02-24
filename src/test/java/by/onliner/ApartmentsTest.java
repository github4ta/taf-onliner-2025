package by.onliner;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ApartmentsTest {

    @Test
    public void testApartmentsMarket(){
        ChromeDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        final String URL="https://www.onliner.by/";
        driver.get(URL);
        final By APARTMENTS_MARKET_BUTTON_XPATH=By.xpath("//a[@href=\"https://r.onliner.by/pk\"]");
        final By HEADING_XPATH=By.xpath("//*[@id=\"container\"]/div/div[2]/div/div/div[1]/div/div[1]/ul/li[1]/a/span/span");
        driver.findElement(APARTMENTS_MARKET_BUTTON_XPATH).click();
        Assertions.assertEquals("Продажа",driver.findElement(HEADING_XPATH).getText());
        driver.quit();
    }
}