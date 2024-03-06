package it.justjoin.ui;

import it.justjoin.pages.HomePage;
import it.justjoin.pages.ProfilePage;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class LoginTest extends BaseTest {

    @Test
    @DisplayName("Check page header and url")
    public void testPageHeaderAndUrl() {
        HomePage homePage = new HomePage();
        homePage.clickSignInBtn();
        homePage.clickSignInCandidateBtn();
        ProfilePage profilePage = new ProfilePage();

        assertAll(
                () -> assertEquals("Sign in or sign up", profilePage.getTextSignInToAccount()),
                () -> assertEquals("https://profile.justjoin.it/login", profilePage.getCurrentUrl())
        );
    }
}
