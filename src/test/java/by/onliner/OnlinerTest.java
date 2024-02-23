package by.onliner;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class OnlinerTest {
    @Test
    public void testCatalogHeader() {
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.onliner.by/");
        driver.findElement(By.cssSelector(".b-top-menu a[href='https://catalog.onliner.by']")).click();
        String expectedCatalogHeaderText = "Каталог";
        String actualCatalogHeaderText = driver.findElement(By.cssSelector(".catalog-navigation__title")).getText();
        Assertions.assertTrue(actualCatalogHeaderText.contains(expectedCatalogHeaderText));
        driver.quit();
    }
}
