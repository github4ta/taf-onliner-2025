package by.onliner;

import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AboutTest extends BaseTest {
    public static String aboutCompanyLinkXPath = "//a[@href='https://blog.onliner.by/about']";
    public static String aboutCompanyPageTitleXPath = "//div[@class='news-header__title']/h1";

    public void openAboutCompanyPage() {
        WebElement aboutCompanyLink = driver.findElement(By.xpath(aboutCompanyLinkXPath));
        aboutCompanyLink.click();
    }

    public String getAboutCompanyPageTitleText() {
        WebElement aboutCompanyPageTitle = driver.findElement(By.xpath(aboutCompanyPageTitleXPath));
        return aboutCompanyPageTitle.getText();
    }

    @Test
    public void testAboutOpened() {
        openAboutCompanyPage();
        Assertions.assertEquals("О сайте", getAboutCompanyPageTitleText());
    }
}
