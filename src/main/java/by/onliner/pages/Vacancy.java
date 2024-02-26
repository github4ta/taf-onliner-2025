package by.onliner.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class Vacancy {
    WebDriver driver;
    public Vacancy(WebDriver driver){
        this.driver=driver;
    }
    public String vacancyHeaderGetText() {
        return driver.findElement(By.xpath(VacancyLocator.VACANCY_HEADER_XPATH)).getText();
    }
    public void openVacancy(){
        driver.findElement(VacancyLocator.vacancy).click();
        for (String tab : driver.getWindowHandles()) {
            driver.switchTo().window(tab);
        }
    }
    public List<String> getSectionsNames(){
        List<WebElement> sectionNameElements = driver.findElements(VacancyLocator.vacancySections);
        List<String> sectionNames = new ArrayList<>();
        for (WebElement sectionName : sectionNameElements){
            sectionNames.add(sectionName.getText());
        }
        return sectionNames;
    }
}
