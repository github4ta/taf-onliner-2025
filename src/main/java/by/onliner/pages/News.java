package by.onliner.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class News {
    WebDriver driver;

    public News(WebDriver driver) {
        this.driver = driver;
    }

    public String getNewsTitleText() {
        WebElement newsTitle = driver.findElement(By.xpath(NewsLocator.NEWS_XPATH));
        return newsTitle.getText();
    }
}
