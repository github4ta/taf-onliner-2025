package by.onliner;

import by.onliner.pages.CatalogLocator;
import by.onliner.pages.ContactsLocator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

public class ContactsTest extends BaseTest {
    @Test
    public void testContactsOpened() {
        Assertions.assertTrue(driver.findElement(By.xpath("//div[@class=\"news-header__title\"]")).getText().contains("Контакты редакции."));
    }
}
