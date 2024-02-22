package by.onliner;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutobaraholkaTest {
    @Test
    public void testOpenAutobaraholka() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        String url = "https://www.onliner.by/";
        driver.navigate().to(url);
        String autobaraholkaXpath = "//ul[@class='b-main-navigation']/li[3]/a";
        driver.findElement(By.xpath(autobaraholkaXpath)).click();
        String actualTitleXpath = "//h1[@class='vehicle-form__title vehicle-form__title_big-alter']";
        Assertions.assertEquals("Автобарахолка", driver.findElement(By.xpath(actualTitleXpath)).getText());
        driver.quit();
    }
}
