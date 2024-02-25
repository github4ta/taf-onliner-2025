package by.onliner;

import by.onliner.pages.AboutLocator;
import by.onliner.pages.HomePageLocator;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AboutTest extends BaseTest {

    public void openAboutCompanyPage() {
        WebElement aboutCompanyLink = driver.findElement(By.xpath(HomePageLocator.aboutCompanyLinkXPath));
        aboutCompanyLink.click();
    }

    public String getAboutCompanyPageTitleText() {
        WebElement aboutCompanyPageTitle = driver.findElement(By.xpath(AboutLocator.aboutCompanyPageTitleXPath));
        return aboutCompanyPageTitle.getText();
    }

    @Test
    public void testAboutOpened() {
        openAboutCompanyPage();
        Assertions.assertEquals("О сайте", getAboutCompanyPageTitleText());
    }
}
