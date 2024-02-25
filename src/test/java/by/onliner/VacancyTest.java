package by.onliner;

import by.onliner.pages.HomePage;
import by.onliner.pages.HomePageLocator;
import by.onliner.pages.Vacancy;
import by.onliner.pages.VacancyLocator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class VacancyTest extends BaseTest {
    @Test
    public void testVacancyOpened() {
        Vacancy vacancy=new Vacancy((ChromeDriver) driver);
        HomePage homePage=new HomePage((ChromeDriver) driver);
        homePage.vacancyBtnClick();
        Assertions.assertEquals("Вакансии", vacancy.vacancyHeaderGetText());
    }
}
