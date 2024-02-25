package by.onliner;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static by.onliner.pages.CopyrightsLocator.COPYRIGHTS;


public class HomeTest extends BaseTest {
    @Test
    public void testHomePageOpened() {
        WebElement copyrights = driver.findElement(By.cssSelector(COPYRIGHTS));
        Assertions.assertEquals("© 2001—2024 Onlíner", copyrights.getText());
    }
}
