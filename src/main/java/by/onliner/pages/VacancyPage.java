package by.onliner.pages;

import driver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class VacancyPage {
    private WebDriver driver;

    public VacancyPage() {
        this.driver = Driver.getDriver();
    }

    private By vacancyHeader = By.xpath("//div[@class='news-header__title']/h1");
    private By vacancy = By.cssSelector(".news-text a");
    private By vacancySections = By.xpath("//div[@class='news-text']/p");

    public String vacancyHeaderGetText() {
        return driver.findElement(vacancyHeader).getText();
    }

    public void openVacancy() {
        driver.findElement(vacancy).click();
        for (String tab : driver.getWindowHandles()) {
            driver.switchTo().window(tab);
        }
    }

    public List<String> getSectionsNames() {
        List<WebElement> sectionNameElements = driver.findElements(vacancySections);
        List<String> sectionNames = new ArrayList<>();
        for (WebElement sectionName : sectionNameElements) {
            sectionNames.add(sectionName.getText());
        }
        return sectionNames;
    }
}
