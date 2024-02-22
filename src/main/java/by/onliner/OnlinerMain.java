package by.onliner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OnlinerMain {
    public String redactionContactsXpath = "//*[contains(text(),\"Контакты редакции\")]";
    public String titleContactsPageXpath = "//div[@class=\"news-header__title\"]";
    ChromeDriver driver;

    public void navigateToContacts() {
        WebElement navigateToContacts = driver.findElement(By.xpath(redactionContactsXpath));
        navigateToContacts.click();
    }

    public String titleContactsPage() {
        WebElement titleContactsPage = driver.findElement(By.xpath(titleContactsPageXpath));
        titleContactsPage.getText();
    }

}
