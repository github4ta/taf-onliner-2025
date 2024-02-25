package by.onliner;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class JobsTest extends BaseTest {
    @Test
    public void testJobs() {
        driver.findElement(By.xpath("//a[@href='https://blog.onliner.by/vacancy']")).click();
        Assertions.assertEquals("Вакансии", driver.findElement(By.xpath("//div[@class='news-header__title']/h1")).getText());
    }
}
