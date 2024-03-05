package by.onliner.ui;

import by.onliner.pages.HomePage;
import by.onliner.pages.VacancyPage;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class VacancyTest extends BaseTest {
    @Test
    public void testVacancyOpened() {
        VacancyPage vacancyPage = new VacancyPage();
        HomePage homePage = new HomePage();
        homePage.vacancyBtnClick();
        assertEquals("Вакансии", vacancyPage.vacancyHeaderGetText());
    }

    @Test
    public void testVacancyTextSections() {
        VacancyPage vacancyPage = new VacancyPage();
        HomePage homePage = new HomePage();
        homePage.vacancyBtnClick();
        vacancyPage.openVacancy();
        vacancyPage.getSectionsNames();
        List<String> sectionNames = vacancyPage.getSectionsNames();

        assertAll(
                "Check section names",
                () -> assertEquals("Наши пожелания к соискателям:", sectionNames.get(1)),
                () -> assertEquals("Чем предстоит заниматься:", sectionNames.get(3)),
                () -> assertEquals("Что для нас важно при отборе кандидатов:", sectionNames.get(4))
        );
    }
}
