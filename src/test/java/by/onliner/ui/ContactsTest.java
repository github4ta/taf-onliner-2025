package by.onliner.ui;

import by.onliner.pages.ContactsPage;
import by.onliner.pages.HomePage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ContactsTest extends BaseTest {
    @Test
    public void testContactsOpened() {
        HomePage hp = new HomePage();
        hp.contactsClick();
        ContactsPage cp = new ContactsPage();
        Assertions.assertTrue(cp.getCONTACTS_HOME_PAGE_XPATH().contains("Контакты редакции."));
    }

    @Test
    public void testEmailAddressIsPresented() {
        HomePage hp = new HomePage();
        hp.contactsClick();
        ContactsPage cp = new ContactsPage();
        Assertions.assertEquals("info@onliner.by", cp.getEmailOfOnliner());
    }
}
