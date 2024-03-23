package by.onliner.ui;

import by.onliner.pages.HomePage;
import by.onliner.pages.TasksPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TasksTest extends BaseTest {

    @Test
    public void testTasksOpened() {
        HomePage homePage = new HomePage();
        homePage.clickServiceSection();
        TasksPage tasks = new TasksPage();
        Assertions.assertEquals("Заказы", tasks.getTextHeader());
    }

    @Test
    public void testCompareTitle () throws InterruptedException{
        HomePage homePage = new HomePage();
        TasksPage tasks = new TasksPage();
        homePage.clickServiceSection();
        tasks.clickMinsk();
        tasks.clickForAnimals();
        tasks.clickHaircutForAnimals();
        tasks.clickActiveStatus();
        tasks.clickFirstItemInSearch();
        Assertions.assertEquals("Стрижка собаки порода ши-тцу", tasks.compareTitle());
    }

    @Test
    public void checkTaskDetailsTitle() throws InterruptedException {
        HomePage homePage = new HomePage();
        homePage.clickServiceSection();
        TasksPage tasks = new TasksPage();
        tasks.selectSectionFromList();
        tasks.selectCheckbox();
        Thread.sleep(2000);
        tasks.selectOffer();
        Thread.sleep(3000);
        Assertions.assertEquals("Подготовка документов для визы", tasks.getServiceDetailText());
    }
}
