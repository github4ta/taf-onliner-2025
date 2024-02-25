package by.onliner;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

public class CatalogTest extends BaseTest{
@Test
    public void testCatalogOpened(){
    driver.findElement(By.cssSelector(".b-top-menu a[href='https://catalog.onliner.by']")).click();
    String expectedCatalogHeaderText = "Каталог";
    String actualCatalogHeaderText = driver.findElement(By.cssSelector(".catalog-navigation__title")).getText();
    Assertions.assertTrue(actualCatalogHeaderText.contains(expectedCatalogHeaderText));
}
}
