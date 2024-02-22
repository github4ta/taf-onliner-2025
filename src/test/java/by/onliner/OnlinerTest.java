package by.onliner;

import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OnlinerTest {
    ChromeDriver driver;

    @BeforeEach
    public void openBrowser() {
        driver = new ChromeDriver();
        String url = "https://www.onliner.by/";
        driver.navigate().to(url);
        driver.manage().window().maximize();
    }

    @AfterEach
    public void closeBrowser() {
        driver.quit();
    }

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
}
