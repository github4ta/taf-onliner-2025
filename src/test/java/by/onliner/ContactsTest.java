package by.onliner;

import by.onliner.pages.CatalogLocator;
import by.onliner.pages.ContactsLocator;
import by.onliner.pages.HomePageLocator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

public class ContactsTest extends BaseTest {
    @Test
    public void testContactsOpened() {
        driver.findElement(By.xpath(HomePageLocator.CONTACTS_XPATH)).click();
        Assertions.assertTrue(driver.findElement(By.xpath(ContactsLocator.CONTACTS_HOME_PAGE_XPATH)).getText().contains("Контакты редакции."));
    }
}
