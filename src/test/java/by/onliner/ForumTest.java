package by.onliner;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ForumTest extends BaseTest {
    @Test
    public void testForumOpened() {
        String forumXpath = "//a[@href='https://forum.onliner.by/']/span[@class='b-main-navigation__text']";
        String personalDataXpath = "//button[@aria-label='Соглашаюсь']/p[@class='fc-button-label']";
        String titleXpath = "//h1[@class='m-title']";
        driver.findElement(By.xpath(forumXpath)).click();
        driver.findElement(By.xpath(personalDataXpath)).click();
        Assertions.assertEquals("Форум", driver.findElement(By.xpath(titleXpath)).getText());
    }
}
