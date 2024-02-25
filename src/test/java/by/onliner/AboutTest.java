package by.onliner;

import by.onliner.pages.About;
import by.onliner.pages.AboutLocator;
import by.onliner.pages.HomePageLocator;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AboutTest extends BaseTest {

    @Test
    public void testAboutOpened() {
        About about = new About(driver);
        openAboutCompanyPage();
        Assertions.assertEquals("О сайте", about.getAboutCompanyPageTitleText());
    }
}
