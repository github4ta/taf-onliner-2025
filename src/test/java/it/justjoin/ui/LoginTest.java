package it.justjoin.ui;

import it.justjoin.ui.pages.HomePage;
import it.justjoin.ui.pages.LoginPage;
import it.justjoin.ui.pages.PanelPage;
import it.justjoin.ui.pages.ProfilePage;
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
    public void testEmployerLoginPage() {
        HomePage homePage = new HomePage();
        homePage.clickSignInBtn();
        homePage.clickSignInEmployerBtn();
        PanelPage panelPage = new PanelPage();
        assertAll(

                () -> assertEquals("Employer panel", panelPage.getEmployerPanelTitle()),
                () -> assertEquals("https://panel.justjoin.it/login", panelPage.getLoginEmployerURL())
        );
    }

    @Test
    @DisplayName("Verify empty password error messages")
    public void testLoginInvalid() {
        HomePage homePage = new HomePage();
        homePage.clickSignInBtn();
        homePage.clickSignInEmployerBtn();
        PanelPage panelPage = new PanelPage();
        panelPage.inputEmail("test@test.com");
        panelPage.clickSignIn();
        Assertions.assertEquals("This field is required", panelPage.getTextPasswordErrorMessage());
    }
    @Test
    @DisplayName("Check Sign In text when we click Sign In and chose Candidat's profile")
    public void testSignIn(){
        LoginPage lp  = new LoginPage();
        lp.openSite();
        lp.clickSignInBtn();
        lp.choseCandidate();
        lp.choseEnterWithEmailAddress();
        Assertions.assertEquals("Sign in to account",lp.checkTextSignIn());
    }
    @Test
    @DisplayName("Check error message with invalid credentials")
    public void testErrorMessageWithInvalidCredentials(){
        HomePage homePage = new HomePage();
        homePage.acceptCookie();
        homePage.clickSignInBtn();
        homePage.clickSignInEmployerBtn();
        PanelPage panelPage=new PanelPage();
        panelPage.inputEmail("test@test.com");
        panelPage.inputPassword("12345678");
        panelPage.clickSignIn();
        Assertions.assertEquals("Invalid Email or password.", panelPage.getErrorMessageText());
    }
}
