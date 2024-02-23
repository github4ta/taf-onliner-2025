package by.onliner;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import java.time.Duration;

public class TestContactsOnliner {
    @Test
    public void onlinerContactsTest() {

        ChromeDriver chromeDriver = new ChromeDriver();
        String url = "https://www.onliner.by/";
        chromeDriver.manage().window().maximize();
        chromeDriver.navigate().to(url);
        String redactionContactsXpath = "//*[contains(text(),\"�������� ��������\")]";
        String titleContactsPageXpath = "//div[@class=\"news-header__title\"]";
        //WebDriverWait wait = new WebDriverWait(chromeDriver, Duration.ofSeconds(5))wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(redactionContactsXpath))).click();
        chromeDriver.findElement(By.xpath(redactionContactsXpath)).click();
        WebElement titleContactsPage = chromeDriver.findElement(By.xpath(titleContactsPageXpath));
        Assertions.assertTrue(titleContactsPage.getText().contains("�������� ��������."));
    }
}
