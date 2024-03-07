package by.onliner.ui;

import by.onliner.pages.HomePage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class HomeTest extends BaseTest {
    @Test
    public void testHomePageOpened() {
        HomePage homePage = new HomePage();
        Assertions.assertEquals("© 2001—2024 Onlíner", homePage.getCopyrightsText());
    }
}
