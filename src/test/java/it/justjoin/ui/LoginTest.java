package it.justjoin.ui;

import by.onliner.ui.BaseTest;
import it.justjoin.pages.HomePage;
import it.justjoin.pages.ProfilePage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class LoginTest extends BaseTest {

    @Test
    @DisplayName("Candidate login with empty Password field")
    public void testLoginWithEmptyPassword(){
        HomePage homePage = new HomePage();
        homePage.clickSignInBtn();
        homePage.clickSignInCandidateBtn();
        ProfilePage profilePage = new ProfilePage();
        profilePage.clickSignInUsingAddressEmailBtn();
        profilePage.sendKeysEmailField("Test1020@user.com");
        profilePage.clickSingInBtn();
        Assertions.assertEquals("This field is required.", profilePage.getPasswordValidationMsgText());
    }
}
