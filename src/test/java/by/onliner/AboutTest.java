package by.onliner;

import by.onliner.pages.About;
import by.onliner.pages.HomePage;
import org.junit.jupiter.api.*;

public class AboutTest extends BaseTest {

    @Test
    public void testAboutOpened() {
        About about = new About(driver);
        HomePage homePage = new HomePage(driver);
        Assertions.assertEquals("О сайте", about.getAboutCompanyPageTitleText());
    }
}
