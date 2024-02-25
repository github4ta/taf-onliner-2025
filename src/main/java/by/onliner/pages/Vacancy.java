package by.onliner.pages;

import org.openqa.selenium.By;

public class Vacancy {
    public void vacancyHeaderGetText() {
        driver.findElement(By.xpath(VacancyLocator.VACANCY_HEADER_XPATH)).getText();
    }
}
