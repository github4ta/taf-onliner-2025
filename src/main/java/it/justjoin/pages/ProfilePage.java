package it.justjoin.pages;

import driver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProfilePage {
    private WebDriver driver;

    public ProfilePage() {
        this.driver = Driver.getDriver();
    }

    private final By SIGN_IN_USING_ADDRESS_EMAIL_BTN_NAME = By.name("button-login-link");
   // private final By SIGN_IN_TO_ACCOUNT_HEADING_XPATH = By.xpath("//div[@class=\"MuiBox-root css-57iaev\"]");
    private final By SIGN_IN_TO_ACCOUNT_HEADING_XPATH = By.xpath("//a[@class='register_link']/parent::div/preceding-sibling::div/div");
    private final By EMAIL_FIELD_NAME = By.name("email");
    private final By PASSWORD_FIELD_NAME = By.name("password");
    private final By SIGN_IN_BTN_XPATH = By.xpath("//button[@type='submit']");

    public void clickSignInUsingAddressEmailBtn() {
        driver.findElement(SIGN_IN_USING_ADDRESS_EMAIL_BTN_NAME).click();
    }

    public String getTextSignInToAccount() {
        return driver.findElement(SIGN_IN_TO_ACCOUNT_HEADING_XPATH).getText();
    }

    public void sendKeysEmailField(String email) {
        driver.findElement(EMAIL_FIELD_NAME).sendKeys(email);
    }

    public void sendKeysPasswordField(String password) {
        driver.findElement(PASSWORD_FIELD_NAME).sendKeys(password);
    }

    public void clickSingInBtn() {
        driver.findElement(SIGN_IN_BTN_XPATH).click();
    }

    public String getCurrentUrl() {
        return driver.getCurrentUrl();
    }
}
