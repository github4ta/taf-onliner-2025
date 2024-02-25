package by.onliner;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

public class ContactsTest extends BaseTest {
    @Test
    public void testContactsOpened() {
        driver.findElement(By.xpath("//*[contains(text(),\"Контакты редакции\")]")).click();
        Assertions.assertTrue(driver.findElement(By.xpath("//div[@class=\"news-header__title\"]")).getText().contains("Контакты редакции."));
    }
}
