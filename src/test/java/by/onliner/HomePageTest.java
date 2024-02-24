package by.onliner;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePageTest extends BaseTest {

    WebDriver driver;

    @Test
    public void testCopyRightsText() {
        By copyRights = By.cssSelector(".footer-style__copy");
        Assertions.assertEquals("© 2001—2024 Onlíner", driver.findElement(copyRights).getText());
    }
}
