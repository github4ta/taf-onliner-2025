package it.academy.kulachek;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {
    WebDriver driver = new ChromeDriver();
    static String url = "https://www.onliner.by/";
    static String sectionServices = "(//a[@href='https://s.onliner.by/tasks'])[2]";
    static String titleOrders = "//div[@class='service-header__title service-header__title_huge']";

    @org.junit.jupiter.api.Test
    public void testOnliner() {
        driver.get(url);
        driver.manage().window().maximize();
        WebElement element = driver.findElement(By.xpath(sectionServices));
        element.click();
        Assertions.assertEquals("Заказы", driver.findElement(By.xpath(titleOrders)).getText());
    }

}