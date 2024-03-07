package it.justjoin.pages;

import driver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver driver;
    public LoginPage(){
        this.driver = Driver.getDriver();
    };
    private final String SIGN_IN_BTN = "//button[@class=\"MuiButtonBase-root MuiButton-root MuiButton-solid MuiButton-solidPrimary MuiButton-sizeMedium MuiButton-solidSizeMedium MuiButton-root MuiButton-solid MuiButton-solidPrimary MuiButton-sizeMedium MuiButton-solidSizeMedium css-ikdjr\"]";
    private final String CHOSE_CANDIDATS_PROFILE = "//button[@class='css-1espnff']";
    private final String ENTER_WITH_EMAIL_ADDRESS = "//button[@class=\"MuiButtonBase-root MuiButton-root MuiButton-solid MuiButton-solidPrimary MuiButton-sizeLarge MuiButton-solidSizeLarge MuiButton-fullWidth MuiButton-root MuiButton-solid MuiButton-solidPrimary MuiButton-sizeLarge MuiButton-solidSizeLarge MuiButton-fullWidth css-ttne5e\"]";
    private final String TEXT_SIGN_IN = "//div[@class=\"MuiBox-root css-57iaev\"]";
    public void openSite(){
        driver.navigate().to("https://profile.justjoin.it/login/by-email");
    }
    public void clickSignInBtn(){
        driver.findElement(By.xpath(SIGN_IN_BTN)).click();
    }
    public void choseCandidate() {
        driver.findElement(By.xpath(CHOSE_CANDIDATS_PROFILE)).click();
    }
    public void choseEnterWithEmailAddress(){
        driver.findElement(By.xpath(ENTER_WITH_EMAIL_ADDRESS)).click();
    }
    public String checkTextSignIn(){
        return driver.findElement(By.xpath(TEXT_SIGN_IN)).getText();
    }
}
