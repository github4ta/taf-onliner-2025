package by.onliner;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReturnPolicyTest {

    @Test
    public void checkReturnPolicyTest(){
        ChromeDriver driver = new ChromeDriver();
        String url = "https://www.onliner.by/";
        driver.navigate().to(url);

        WebElement returnPolicy = driver.findElement(By.xpath("//a[@href='https://blog.onliner.by/politika-konfidencialnosti']"));
        returnPolicy.click();

        String expectedResult = "Правила возврата товаров и денег";
        WebElement pageTitle = driver.findElement(By.xpath("//div[@class='news-header__title']"));
        Assertions.assertEquals(expectedResult, pageTitle.getText());

        driver.quit();
    }

}
