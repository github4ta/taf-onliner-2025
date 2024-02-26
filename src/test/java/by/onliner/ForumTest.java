package by.onliner;

import by.onliner.pages.ForumPage;
import by.onliner.pages.HomePage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class ForumTest extends BaseTest {
    @Test
    public void testForumOpened() {
        HomePage homePage = new HomePage(driver);
        homePage.openForum();
        ForumPage forumPage = new ForumPage(driver);
        Assertions.assertEquals("Форум", forumPage.getText());
    }

    @Test
    public void testImportantSection() {
        HomePage homePage = new HomePage(driver);
        homePage.openForum();
        ForumPage forumPage = new ForumPage(driver);
        String expected = forumPage.getTextFirstElementInListImportantSection();
        forumPage.clickFirstElementInListImportantSection();
        Assertions.assertEquals(expected, forumPage.getTextHeadingFirstElementInListImportantSection());
    }
}
