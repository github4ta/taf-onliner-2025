package by.onliner;

import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OnlinerTest extends BaseTest{
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
    @DisplayName("About Company page title IS 'О сайте'")
    public void testAboutCompanyPageRendering() {
        openAboutCompanyPage();
        Assertions.assertEquals("О сайте", getAboutCompanyPageTitleText());
    }

    @Test
    public void testCatalogHeader() {
        driver.findElement(By.cssSelector(".b-top-menu a[href='https://catalog.onliner.by']")).click();
        String expectedCatalogHeaderText = "Каталог";
        String actualCatalogHeaderText = driver.findElement(By.cssSelector(".catalog-navigation__title")).getText();
        Assertions.assertTrue(actualCatalogHeaderText.contains(expectedCatalogHeaderText));
    }
}
