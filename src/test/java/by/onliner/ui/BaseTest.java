package by.onliner.ui;

import driver.Driver;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;

public class BaseTest {
    WebDriver driver;

    @BeforeEach
    public void warmUp() {
        driver = Driver.getDriver();
        driver.get("https://www.onliner.by/");
    }

    @AfterEach
    public void tearDown() {
        Driver.quitDriver();
    }
}
