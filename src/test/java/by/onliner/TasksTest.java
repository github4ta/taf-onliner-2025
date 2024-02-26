package by.onliner;

import by.onliner.pages.HomePage;
import by.onliner.pages.Tasks;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TasksTest extends BaseTest {

    @Test
    public void testTasksOpened() {
        HomePage homePage = new HomePage(driver);
        homePage.clickServiceSection();
        Tasks tasks = new Tasks(driver);
        Assertions.assertEquals("Заказы", tasks.getTextHeader());
    }

    @Test
    public void checkTaskDetailsTitle() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        homePage.clickServiceSection();
        Tasks tasks = new Tasks(driver);
        tasks.selectSectionFromList();
        tasks.selectCheckbox();
        Thread.sleep(2000);
        tasks.selectOffer();
        Thread.sleep(3000);
        Assertions.assertEquals("Подготовка документов для визы", tasks.getServiceDetailText());
    }
}
