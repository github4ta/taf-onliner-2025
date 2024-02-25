package by.onliner.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

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
}
