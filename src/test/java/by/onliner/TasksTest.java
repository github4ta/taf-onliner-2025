package by.onliner;

import by.onliner.pages.HomePage;
import by.onliner.pages.HomePageLocator;
import by.onliner.pages.Tasks;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

public class TasksTest extends BaseTest {

    @Test
    public void testTasksOpened() {
        HomePage homePage = new HomePage(driver);
        homePage.clickServiceSection();
        Tasks tasks = new Tasks(driver);
        Assertions.assertEquals("Заказы", tasks.getTextHeader());
    }
}
