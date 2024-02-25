package by.onliner;

import by.onliner.pages.AutobaraholkaLocator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutobaraholkaTest extends BaseTest{
    @Test
    public void testAutobaraholkaOpened() {
        driver.findElement(By.xpath(AutobaraholkaLocator.AUTOBARAHOLKA_XPATH)).click();
        Assertions.assertEquals("Автобарахолка", driver.findElement(By.xpath(AutobaraholkaLocator.ACTUAL_TITLE_XPATH)).getText());
    }
}
