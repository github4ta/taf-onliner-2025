package by.onliner.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ContactsPage {
    WebDriver driver;
    public ContactsPage(WebDriver driver){
        this.driver = driver;
    }
    public String getEmailOfOnliner(){
        return driver.findElement(By.xpath(ContactsLocator.EMAIL_OF_ONLINER)).getText();
    }
}
