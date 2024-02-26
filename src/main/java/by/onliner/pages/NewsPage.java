package by.onliner.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NewsPage {
    private final String NEWS_XPATH = "//h1[@class='m-title']";
    private WebDriver driver;

    public NewsPage(WebDriver driver) {
        this.driver = driver;
    }

    public boolean getNewsTitleText(String text) {
        WebElement newsTitle = driver.findElement(By.xpath(NEWS_XPATH));
        String newsTitleText = newsTitle.getText();
        return newsTitleText.contains(text);
    }
}
