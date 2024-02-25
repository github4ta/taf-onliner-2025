package by.onliner;

import by.onliner.pages.ForumLocator;
import by.onliner.pages.HomePageLocator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ForumTest extends BaseTest {
    @Test
    public void testForumOpened() {
        driver.findElement(By.xpath(HomePageLocator.FORUM_XPATH)).click();
        driver.findElement(By.xpath(HomePageLocator.PERSONAL_DATA_XPATH)).click();
        Assertions.assertEquals("Форум", driver.findElement(By.xpath(ForumLocator.TITLE_XPATH)).getText());
    }
}
