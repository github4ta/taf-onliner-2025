package by.onliner;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ContactsTest extends BaseTest {
    @Test
    public void testContactsOpened() {

        String redactionContactsXpath = "//*[contains(text(),\"Контакты редакции\")]";
        String titleContactsPageXpath = "//div[@class=\"news-header__title\"]";
        driver.findElement(By.xpath(redactionContactsXpath)).click();
        WebElement titleContactsPage = driver.findElement(By.xpath(titleContactsPageXpath));
        Assertions.assertTrue(titleContactsPage.getText().contains("Контакты редакции."));
    }
}
