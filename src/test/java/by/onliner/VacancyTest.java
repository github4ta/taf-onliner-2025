package by.onliner;

import by.onliner.pages.HomePage;
import by.onliner.pages.Vacancy;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class VacancyTest extends BaseTest {
    @Test
    public void testVacancyOpened() {
        Vacancy vacancy=new Vacancy(driver);
        HomePage homePage=new HomePage(driver);
        homePage.vacancyBtnClick();
        Assertions.assertEquals("Вакансии", vacancy.vacancyHeaderGetText());
    }
    @Test
    public void testVacancyTextSections(){
        Vacancy vacancy = new Vacancy(driver);
        HomePage homePage = new HomePage(driver);
        homePage.vacancyBtnClick();
        vacancy.openVacancy();
        vacancy.getSectionsNames();
        List<String> sectionNames = vacancy.getSectionsNames();
        Assertions.assertEquals("Наши пожелания к соискателям:", sectionNames.get(1));
        Assertions.assertEquals("Чем предстоит заниматься:", sectionNames.get(3));
        Assertions.assertEquals("Что для нас важно при отборе кандидатов:", sectionNames.get(4));
    }
}
