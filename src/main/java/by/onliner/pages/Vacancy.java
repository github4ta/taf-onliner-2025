package by.onliner.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Vacancy {
    ChromeDriver driver;
    public Vacancy(ChromeDriver driver){
        this.driver=driver;
    }
    public String vacancyHeaderGetText() {
        return driver.findElement(By.xpath(VacancyLocator.VACANCY_HEADER_XPATH)).getText();
    }
}
