package by.onliner;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomePageTest {

    @Test
    public void testCopyRightsText() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.onliner.by/");
        By copyRights = By.cssSelector(".footer-style__copy");
        Assertions.assertEquals("© 2001—2024 Onlíner", driver.findElement(copyRights).getText());
    }
}

