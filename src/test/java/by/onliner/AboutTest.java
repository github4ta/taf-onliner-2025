package by.onliner;

import by.onliner.pages.About;
import by.onliner.pages.AboutPage;
import by.onliner.pages.HomePage;
import org.junit.jupiter.api.*;

public class AboutTest extends BaseTest {

    @Test
    public void testAboutOpened() {
        HomePage homePage = new HomePage(driver);
        AboutPage aboutPage = new AboutPage(driver);
        homePage.openAboutCompanyPage();
        Assertions.assertEquals("О сайте", aboutPage.getTextCompanyPageTittle());
    }
}
