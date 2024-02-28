package by.onliner.domain;

import by.onliner.driver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Users {
    private WebDriver driver;

    public Users() {
        this.driver = Driver.getDriver();
    }

    private final String SURNAME_URL = "https://eslyes.com/namesdict/100_last_names.htm";
    private final String SURNAME_LIST_XPATH = "//ul/b/a";


    public String getRandomSurname() {
        driver.get(SURNAME_URL);
        List<WebElement> surnameList = driver.findElements(By.xpath(SURNAME_LIST_XPATH));
        Random random = new Random();
        WebElement randomSurnamePosition = surnameList.get(random.nextInt(surnameList.size()));
        return randomSurnamePosition.getText();
    }
}
