package by.onliner;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ContactsOnlinerTest extends BaseTest {
    @Test
    public void onlinerContactsTest() {

        String redactionContactsXpath = "//*[contains(text(),\"Контакты редакции\")]";
        String titleContactsPageXpath = "//div[@class=\"news-header__title\"]";
        //WebDriverWait wait = new WebDriverWait(chromeDriver, Duration.ofSeconds(5))wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(redactionContactsXpath))).click();
        driver.findElement(By.xpath(redactionContactsXpath)).click();
        WebElement titleContactsPage = driver.findElement(By.xpath(titleContactsPageXpath));
        Assertions.assertTrue(titleContactsPage.getText().contains("Контакты редакции."));
    }
}
