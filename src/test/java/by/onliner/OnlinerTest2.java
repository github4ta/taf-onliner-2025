package by.onliner;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OnlinerTest2 extends BaseTest{
    @Test
    public void testOnliner2() {
        String serviceSection = "(//a[@href='https://s.onliner.by/tasks'])[2]";
        String headerOrders = "//div[@class='service-header__title service-header__title_huge']";
        driver.findElement(By.xpath(serviceSection)).click();
        Assertions.assertEquals("Заказы", driver.findElement(By.xpath(headerOrders)).getText());
    }
}
