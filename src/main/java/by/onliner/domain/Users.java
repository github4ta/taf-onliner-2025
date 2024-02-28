package by.onliner.domain;

import by.onliner.driver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;
import java.util.Random;

public class Users {
    private WebDriver driver;

    public Users() {
        this.driver = Driver.getDriver();
    }

    private final String SURNAME_LIST_XPATH = "//ul/b/a";

    public String getRandomSurname() {
        driver.get("https://eslyes.com/namesdict/100_last_names.htm");
        List<WebElement> surnameList = driver.findElements(By.xpath(SURNAME_LIST_XPATH));
        List<WebElement> newSurnameList = surnameList.subList(0, 50);
        Random random = new Random();
        WebElement randomSurname = newSurnameList.get(random.nextInt(newSurnameList.size()));
        return randomSurname.getText();
    }
}
