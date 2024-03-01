package by.onliner.domain;

import by.onliner.driver.Driver;
import com.google.common.collect.Lists;
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
    private final String NAME_MAN_LIST_Xpath = "//td[2]";
    private final String NAME_WOMAN_LIST_Xpath = "//td[4]";
    private final String NAME_MAN_LIST_Xpath = "//td[2]";

    public String getRandomSurnameFromSite() {
        driver.get("https://eslyes.com/namesdict/100_last_names.htm");
        List<WebElement> surnameList = driver.findElements(By.xpath(SURNAME_LIST_XPATH));
        List<WebElement> newSurnameList = surnameList.subList(0, 50);
        Random random = new Random();
        WebElement randomSurname = newSurnameList.get(random.nextInt(newSurnameList.size()));
        String surnameText = randomSurname.getText();
        Driver.quitDriver();
        return surnameText;
    }

    String[] surnameArray = {"Johnson", "Williams", "Jones", "Brown", "Davis", "Miller", "Wilson", "Moore", "Taylor",
            "Anderson", "Thomas", "Jackson", "White", "Harris", "Martin", "Thompson", "Garcia", "Martinez", "Robinson",
            "Clark", "Rodriguez", "Lewis", "Lee", "Walker", "Hall", "Allen", "Young", "Hernandez", "King", "Wright",
            "Lopez", "Hill", "Scott", "Green", "Adams", "Baker", "Gonzalez", "Nelson", "Carter", "Mitchell", "Perez",
            "Roberts", "Turner", "Phillips", "Campbell", "Parker", "Evans", "Edwards", "Collins"};

    public String getRandomSurname() {
        Random random = new Random();
        return surnameArray[random.nextInt(surnameArray.length)];
    }

    public String getRandomName() {
        driver.get("https://www.ssa.gov/oact/babynames/decades/century.html");
        List<WebElement> nameList = driver.findElements(By.xpath(NAME_MAN_LIST_Xpath));
        Random name = new Random();
        int randomElement = name.nextInt(100);
        WebElement randomName = nameList.get(randomElement);
        Driver.quitDriver();
        return randomName.getText();
    }

    public String getRandomAllName() {
        driver.get("https://www.ssa.gov/oact/babynames/decades/century.html");
        List<WebElement> nameManList = driver.findElements(By.xpath(NAME_MAN_LIST_Xpath));
        List<WebElement> nameWomenList = driver.findElements(By.xpath(NAME_WOMAN_LIST_Xpath));
        nameManList.addAll(nameWomenList);
        Random name = new Random();
        int randomElement = name.nextInt(50,150);
        WebElement randomName = nameManList.get(randomElement);
        Driver.quitDriver();
        return randomName.getText();
    }
 }

    public String getRandomName() {
        driver.get("https://www.ssa.gov/oact/babynames/decades/century.html");
        List<WebElement> nameList = driver.findElements(By.xpath(NAME_MAN_LIST_Xpath));
        Random name = new Random();
        int randomElement = name.nextInt(100);
        WebElement randomName = nameList.get(randomElement);
        return randomName.getText();
    }
}
