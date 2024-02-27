package by.onliner;

import by.onliner.pages.HomePage;
import by.onliner.pages.NewsPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NewsTest extends BaseTest {

    @Test
    public void testNewsOpened() {
        HomePage homePage = new HomePage(driver);
        NewsPage newsPage = new NewsPage(driver);
        homePage.clickTwentyFourHoursNews();
        Assertions.assertTrue(newsPage.getNewsTitleText("Новое за 24 часа"));
    }
}
