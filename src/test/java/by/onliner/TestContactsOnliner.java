package by.onliner;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestContactsOnliner {
    String redactionContactsXpath = "//*[contains(text(),\"Контакты редакции\")]";
    String titleContactsPageXpath = "//div[@class=\"news-header__title\"]";
    ChromeDriver driver;

    public void navigateToContacts() {
        WebElement navigateToContacts = driver.findElement(By.xpath(redactionContactsXpath));
        navigateToContacts.click();
    }

    public String titleContactsPage() {
        WebElement titleContactsPage = driver.findElement(By.xpath(titleContactsPageXpath));
        titleContactsPage.getText();
    }

    @BeforeEach
    public void beforeTest() {
        driver = new ChromeDriver();
        String url = "https://www.onliner.by/";
        driver.manage().window().maximize();
        driver.navigate().to(url);
    }

    @Test
    public
}
