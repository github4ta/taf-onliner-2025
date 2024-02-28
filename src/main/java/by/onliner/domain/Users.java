package by.onliner.domain;

import by.onliner.driver.Driver;
import org.openqa.selenium.WebDriver;

public class Users {
    private WebDriver driver;

    public Users() {
        this.driver = Driver.getDriver();
    }

    private final String SURNAME_LIST_XPATH = "//ul/a";
    private final String SURNAME_URL = "https://eslyes.com/namesdict/100_last_names.htm";
}
