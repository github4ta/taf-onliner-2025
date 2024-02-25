package by.onliner;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

public class TasksTest extends BaseTest {

    @Test
    public void testTasksOpened() {
        String serviceSection = "(//a[@href='https://s.onliner.by/tasks'])[2]";
        String headerOrders = "//div[@class='service-header__title service-header__title_huge']";
        driver.findElement(By.xpath(serviceSection)).click();
        Assertions.assertEquals("Заказы", driver.findElement(By.xpath(headerOrders)).getText());
    }
}
