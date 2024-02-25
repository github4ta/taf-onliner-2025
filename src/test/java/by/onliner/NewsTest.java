package by.onliner;

import by.onliner.pages.HomePage;
import by.onliner.pages.News;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NewsTest extends BaseTest {

    @Test
    public void testNewsOpened() {
        HomePage homePage = new HomePage(driver);
        News news = new News(driver);
        homePage.clickTwentyFourHoursNews();
        Assertions.assertEquals("Новое за 24 часа", news.getNewsTitleText());
    }
}
