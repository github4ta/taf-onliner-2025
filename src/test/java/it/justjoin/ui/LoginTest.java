package it.justjoin.ui;

import it.justjoin.pages.HomePage;
import it.justjoin.pages.PanelPage;
import it.justjoin.pages.ProfilePage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoginTest extends BaseTest {

    @Test
    @DisplayName("Candidate login with empty Password field")
    public void testLoginWithEmptyPassword() {
        HomePage homePage = new HomePage();
        homePage.clickSignInBtn();
        homePage.clickSignInCandidateBtn();
        ProfilePage profilePage = new ProfilePage();
        profilePage.clickSignInUsingAddressEmailBtn();
        profilePage.sendKeysEmailField("Test1020@user.com");
        profilePage.clickSingInBtn();
        Assertions.assertEquals("This field is required.", profilePage.getPasswordValidationMsgText());
    }

    @Test
    @DisplayName("Sign in Employer panel with empty Email and Password fields")
    public void testEmployerLoginWithEmptyEmailAndPassword() {
        HomePage homePage = new HomePage();
        homePage.clickSignInBtn();
        homePage.clickSignInEmployerBtn();
        PanelPage panelPage = new PanelPage();
        panelPage.clickSignIn();
        Assertions.assertEquals("This field is required\n" +
                "This field is required", panelPage.getTextEmailErrorMessage() + "\n" + panelPage.getTextPasswordErrorMessage());
    }

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

    @Test
    @DisplayName("Check login with not verified account")
    public void testLoginWithNotVerifiedAccount() {
        HomePage homePage = new HomePage();
        homePage.clickSignInBtn();
        homePage.clickSignInCandidateBtn();
        ProfilePage profilePage = new ProfilePage();
        profilePage.clickSignInUsingAddressEmailBtn();
        profilePage.sendKeysEmailField("test@test.com");
        profilePage.sendKeysPasswordField("12345678");
        profilePage.clickSingInBtn();
        Assertions.assertEquals("An error has occurred.\n" +
                "Account not verified", profilePage.getAccountNotVerifiedMsg());
    }
    @Test
    @DisplayName("Verify title at the page and URL address")
    public void testEmployerLoginPage(){
        HomePage homePage = new HomePage();
        homePage.clickSignInBtn();
        homePage.clickSignInEmployerBtn();
        PanelPage panelPage = new PanelPage();
        assertAll(
                () -> assertEquals("Employer panel",panelPage.getEmployerPanelTitle()),
                () -> assertEquals("https://profile.justjoin.it/login", panelPage.getLoginEmployerURL())
        );
    }

}
