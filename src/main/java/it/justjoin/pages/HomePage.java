package it.justjoin.pages;

import driver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    WebDriver driver;

    public HomePage() {
        this.driver = Driver.getDriver();
    }

    public static final String SIGN_IN_XPATH = "(//div[@class='css-15rg8cp'])[2]";
    public static final String SIGN_IN_CANDIDATE_XPATH = "(//button[@class='css-1espnff'])[1]";
    public static final String SIGN_IN_EMPLOYER_XPATH = "(//button[@class='css-1espnff'])[2]";

    public void clickSignInBtn() {
        driver.findElement(By.xpath(SIGN_IN_XPATH)).click();
    }

    public void clickSignInCandidateBtn() {
        driver.findElement(By.xpath(SIGN_IN_CANDIDATE_XPATH)).click();
    }

    public void clickSignInEmployerBtn() {
        driver.findElement(By.xpath(SIGN_IN_EMPLOYER_XPATH)).click();
    }
}
