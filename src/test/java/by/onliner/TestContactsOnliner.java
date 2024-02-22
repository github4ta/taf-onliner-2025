package by.onliner;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestContactsOnliner {
    ChromeDriver driver;

    @BeforeEach
    public  void beforeTest() {
        driver = new ChromeDriver();
        String url = "https://www.onliner.by/";
        driver.manage().window().maximize();
        driver.navigate().to(url);
    }

    @Test
    public 



}
