package it.justjoin.ui.pages;

import driver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PanelPage {
    private WebDriver driver;

    public PanelPage() {
        this.driver = Driver.getDriver();
    }

    private final String PAGE_HEADER = ".MuiTypography-h1";
    private final String FORM_HEADER = ".MuiTypography-subtitle2";
    private final String EMAIL_FIELD = "#email";
    private final String PASSWORD_FIELD = "#password";
    private final String SIGN_IN = "//button [@type='submit']";
    private final By EMAIL_ERROR_MESSAGE=By.cssSelector("#email-helper-text");
    private final By PASSWORD_ERROR_MESSAGE=By.cssSelector("#password-helper-text");
    private final String EMPLOYER_PANEL_TITLE ="//h1[@class ='MuiTypography-root MuiTypography-h1 css-14dw42d']";
    public String getPageHeader(){
        return driver.findElement(By.cssSelector(PAGE_HEADER)).getText();
    }
    public String getFormHeader(){
        return driver.findElement(By.cssSelector(FORM_HEADER)).getText();
    }
    public void inputEmail(String str){
        driver.findElement(By.cssSelector(EMAIL_FIELD)).sendKeys(str);
    }
    public void inputPassword(String str){
        driver.findElement(By.cssSelector(PASSWORD_FIELD)).sendKeys(str);
    }
    public void clickSignIn(){
        driver.findElement(By.xpath(SIGN_IN)).click();
    }
    public String getTextEmailErrorMessage(){
        return driver.findElement(EMAIL_ERROR_MESSAGE).getText();
    }
    public String getTextPasswordErrorMessage(){
        return driver.findElement(PASSWORD_ERROR_MESSAGE).getText();
    }
    public String getEmployerPanelTitle(){
        return driver.findElement(By.xpath(EMPLOYER_PANEL_TITLE)).getText();
    }
    public String getLoginEmployerURL(){
        return driver.getCurrentUrl();
    }
}
