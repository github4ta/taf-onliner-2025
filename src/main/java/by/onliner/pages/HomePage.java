package by.onliner.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

    private WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickServiceSection() {
        driver.findElement(By.xpath(HomePageLocator.SERVICE_SECTION)).click();
    }

    public void vacancyBtnClick() {
        driver.findElement(By.xpath(HomePageLocator.VACANCY_BTN)).click();
    }

    public void clickBaraholkaButton() {
        driver.findElement(HomePageLocator.BARAHOLKA_BUTTON_XPATH).click();
    }

    public void openAboutCompanyPage() {
        WebElement aboutCompanyLink = driver.findElement(By.xpath(HomePageLocator.aboutCompanyLinkXPath));
        aboutCompanyLink.click();
    }
    public void contactsClick(){  driver.findElement(By.xpath(HomePageLocator.CONTACTS_XPATH)).click();}
}
