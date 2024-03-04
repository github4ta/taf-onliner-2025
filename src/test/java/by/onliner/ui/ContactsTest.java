package by.onliner.ui;

import by.onliner.pages.ContactsPage;
import by.onliner.pages.HomePage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

public class ContactsTest extends BaseTest {
    @Test
    public void testContactsOpened() {
        HomePage hp = new HomePage(driver);
        hp.contactsClick();
        Assertions.assertTrue(driver.findElement(By.xpath("//div[@class=\"news-header__title\"]")).getText().contains("Контакты редакции."));
    }

    @Test
    public void testEmailAddressIsPresented() {
        HomePage hp = new HomePage(driver);
        ContactsPage cp = new ContactsPage(driver);
        hp.clickContactsOfEditorialOffice();
        Assertions.assertEquals("info@onliner.by", cp.getEmailOfOnliner());
    }
}
