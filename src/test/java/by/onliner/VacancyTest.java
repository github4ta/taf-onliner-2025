package by.onliner;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

public class VacancyTest extends BaseTest {
    @Test
    public void testVacancyOpened() {
        driver.findElement(By.xpath("//a[@href='https://blog.onliner.by/vacancy']")).click();
        Assertions.assertEquals("Вакансии", driver.findElement(By.xpath("//div[@class='news-header__title']/h1")).getText());
    }
}
