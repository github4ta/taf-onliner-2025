package it.justjoin.ui;

import driver.Driver;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;

public class BaseTest {
    WebDriver driver;

    @BeforeEach
    public void warmUp() {
        driver = Driver.getDriver();
        driver.get("https://profile.justjoin.it/");
    }

    @AfterEach
    public void tearDown() {
        Driver.quitDriver();
    }
}
