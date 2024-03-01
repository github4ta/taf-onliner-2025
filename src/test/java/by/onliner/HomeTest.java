package by.onliner;

import by.onliner.pages.HomePage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;


public class HomeTest extends BaseTest {
    @Test
    public void testHomePageOpened() {
        HomePage homePage = new HomePage();
        Assertions.assertEquals("© 2001—2024 Onlíner", homePage.getCopyrightsText());
    }

    @Test
    public void testCopyRightsText() {
        By copyRights = By.cssSelector(".footer-style__copy");
        Assertions.assertEquals("© 2001—2024 Onlíner", driver.findElement(copyRights).getText());
    }
}
