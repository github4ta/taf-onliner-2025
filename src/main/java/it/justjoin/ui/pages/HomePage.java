package it.justjoin.ui.pages;

import driver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;

    public HomePage() {
        this.driver = Driver.getDriver();
    }

    public static final String SIGN_IN_XPATH = "//button[@name='sidebar-open']/parent::div/div/div[4]";
    public static final String SIGN_IN_CANDIDATE_XPATH = "(//ul[@role='menu']//button)[1]";
    public static final String SIGN_IN_EMPLOYER_XPATH = "(//ul[@role='menu']//button)[2]";
    public static final String COOKIE = "#cookiescript_accept";

    public void clickSignInBtn() {
        driver.findElement(By.xpath(SIGN_IN_XPATH)).click();
    }

    public void clickSignInCandidateBtn() {
        driver.findElement(By.xpath(SIGN_IN_CANDIDATE_XPATH)).click();
    }

    public void clickSignInEmployerBtn() {
        driver.findElement(By.xpath(SIGN_IN_EMPLOYER_XPATH)).click();
    }
    public void acceptCookie(){
        driver.findElement(By.cssSelector(COOKIE)).click();
    }
}
