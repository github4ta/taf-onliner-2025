package by.onliner;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

public class HomePageTest extends BaseTest {

    @Test
    public void testCopyRightsText() {
        By copyRights = By.cssSelector(".footer-style__copy");
        Assertions.assertEquals("© 2001—2024 Onlíner", driver.findElement(copyRights).getText());
    }
}
