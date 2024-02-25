package by.onliner;

import by.onliner.pages.HomePageLocator;
import by.onliner.pages.VacancyLocator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

public class VacancyTest extends BaseTest {
    @Test
    public void testVacancyOpened() {
        driver.findElement(By.xpath(HomePageLocator.VACANCY_BTN)).click();
        Assertions.assertEquals("Вакансии", driver.findElement(By.xpath(VacancyLocator.VACANCY_HEADER_XPATH)).getText());
    }
}
