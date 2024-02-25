package by.onliner.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static by.onliner.pages.HomePageLocator.COPYRIGHTS;

public class HomePage {
    WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void openForum() {
        WebElement forumBtn = driver.findElement(By.xpath(HomePageLocator.FORUM_XPATH));
        forumBtn.click();
    }

    public void clickPolicy() {
        WebElement policy = driver.findElement(By.xpath(HomePageLocator.PERSONAL_DATA_XPATH));
        policy.click();
    }


    public void clickServiceSection() {
        driver.findElement(By.xpath(HomePageLocator.SERVICE_SECTION)).click();
    }

    public void vacancyBtnClick() {
        driver.findElement(By.xpath(HomePageLocator.VACANCY_BTN)).click();
    }

    public void clickBaraholkaButton(){
        driver.findElement(HomePageLocator.BARAHOLKA_BUTTON_XPATH).click();
    }

    public void openAboutCompanyPage() {
        WebElement aboutCompanyLink = driver.findElement(By.xpath(HomePageLocator.aboutCompanyLinkXPath));
        aboutCompanyLink.click();
    }
    public void contactsClick(){  driver.findElement(By.xpath(HomePageLocator.CONTACTS_XPATH)).click();}
    public void clickReturnPolicy(){
        driver.findElement(By.xpath(HomePageLocator.RETURN_POLICY)).click();

    }

    public String getCopyrightsText() {
        return driver.findElement(By.cssSelector(COPYRIGHTS)).getText();
    }
    public void clickAutobaraholkaBtn(){driver.findElement(By.xpath(HomePageLocator.AUTOBARAHOLKA_XPATH)).click();
    }
    public void clickContactsOfEditorialOffice(){
        driver.findElement(By.xpath(ContactsLocator.CONTACTS_OF_EDITORIAL_OFFICE)).click();
    }
}
