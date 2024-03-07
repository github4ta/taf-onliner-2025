package it.justjoin.pages;

import driver.Driver;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver driver;
    public LoginPage(){ driver = Driver.getDriver();};
    public String signInBtn = "//button[@class=\"MuiButtonBase-root MuiButton-root MuiButton-solid MuiButton-solidPrimary MuiButton-sizeMedium MuiButton-solidSizeMedium MuiButton-root MuiButton-solid MuiButton-solidPrimary MuiButton-sizeMedium MuiButton-solidSizeMedium css-ikdjr\"]";
    public String choseCandidatsProfile = "//button[@class='css-1espnff']";
    public String enterWithEmailAddress = "//button[@class=\"MuiButtonBase-root MuiButton-root MuiButton-solid MuiButton-solidPrimary MuiButton-sizeLarge MuiButton-solidSizeLarge MuiButton-fullWidth MuiButton-root MuiButton-solid MuiButton-solidPrimary MuiButton-sizeLarge MuiButton-solidSizeLarge MuiButton-fullWidth css-ttne5e\"]";
    public String textSignIn = "//div[@class=\"MuiBox-root css-57iaev\"]";
}
