package by.onliner;

import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OnlinerTest extends BaseTest {

    @Test
    public void testCatalogHeader() {
        driver.findElement(By.cssSelector(".b-top-menu a[href='https://catalog.onliner.by']")).click();
        String expectedCatalogHeaderText = "Каталог";
        String actualCatalogHeaderText = driver.findElement(By.cssSelector(".catalog-navigation__title")).getText();
        Assertions.assertTrue(actualCatalogHeaderText.contains(expectedCatalogHeaderText));
    }

    @Test
    public void testOnliner() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.onliner.by/");
        String forumXpath = "//a[@href='https://forum.onliner.by/']/span[@class='b-main-navigation__text']";
        String personalDataXpath = "//button[@aria-label='Соглашаюсь']/p[@class='fc-button-label']";
        String titleXpath = "//h1[@class='m-title']";
        driver.findElement(By.xpath(forumXpath)).click();
        driver.findElement(By.xpath(personalDataXpath)).click();
        Assertions.assertEquals("Форум", driver.findElement(By.xpath(titleXpath)).getText());
    }
}
