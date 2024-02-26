package by.onliner;

import by.onliner.pages.HomePage;
import by.onliner.pages.VacancyPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class VacancyTest extends BaseTest {
    @Test
    public void testVacancyOpened() {
        VacancyPage vacancyPage=new VacancyPage(driver);
        HomePage homePage=new HomePage(driver);
        homePage.vacancyBtnClick();
        Assertions.assertEquals("Вакансии", vacancyPage.vacancyHeaderGetText());
    }
    @Test
    public void testVacancyTextSections(){
        VacancyPage vacancyPage = new VacancyPage(driver);
        HomePage homePage = new HomePage(driver);
        homePage.vacancyBtnClick();
        vacancyPage.openVacancy();
        vacancyPage.getSectionsNames();
        List<String> sectionNames = vacancyPage.getSectionsNames();
        Assertions.assertEquals("Наши пожелания к соискателям:", sectionNames.get(1));
        Assertions.assertEquals("Чем предстоит заниматься:", sectionNames.get(3));
        Assertions.assertEquals("Что для нас важно при отборе кандидатов:", sectionNames.get(4));
    }
}
