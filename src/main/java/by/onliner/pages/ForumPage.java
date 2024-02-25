package by.onliner.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ForumPage {
    WebDriver driver;

    public ForumPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getText() {
        WebElement text = driver.findElement(By.xpath(ForumLocator.TITLE_XPATH));
        return text.getText();
    }
}
