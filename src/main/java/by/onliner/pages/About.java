package by.onliner.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class About {
    WebDriver driver;

    public About(WebDriver driver) {
        this.driver = driver;
    }

    public String getAboutCompanyPageTitleText() {
        WebElement aboutCompanyPageTitle = driver.findElement(By.xpath(AboutLocator.aboutCompanyPageTitleXPath));
        return aboutCompanyPageTitle.getText();
    }
}
