package by.onliner;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReturnPolicyTest extends BaseTest {
    @Test
    public void checkReturnPolicyTest() {
        WebElement returnPolicy = driver.findElement(By.xpath("//a[@href='https://blog.onliner.by/pravila-vozvrata-tovarov-i-deneg']"));
        returnPolicy.click();

        String expectedResult = "Правила возврата товаров и денег";
        WebElement pageTitle = driver.findElement(By.xpath("//div[@class='news-header__title']"));
        Assertions.assertEquals(expectedResult, pageTitle.getText());
    }
}
