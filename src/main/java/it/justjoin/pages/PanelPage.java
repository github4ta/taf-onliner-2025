package it.justjoin.pages;

import driver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PanelPage {
    WebDriver driver;

    public PanelPage(WebDriver driver) {
        this.driver = Driver.getDriver();
    }

    private final String PAGE_HEADER = ".MuiTypography-h1";
    private final String FORM_HEADER = ".MuiTypography-subtitle2";
    private final String EMAIL_FIELD = "#email";
    private final String PASSWORD_FIELD = "#password";
    private final String SIGN_IN = "//button [@type='submit']";
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
    public void clickSignIn(String str){
        driver.findElement(By.xpath(SIGN_IN)).click();
    }
}
