package by.onliner;

import by.onliner.pages.ForumLocator;
import by.onliner.pages.ForumPage;
import by.onliner.pages.HomePage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

public class ForumTest extends BaseTest {
    @Test
    public void testForumOpened() {
        driver.findElement(By.xpath(HomePageLocator.FORUM_XPATH)).click();
        driver.findElement(By.xpath(HomePageLocator.PERSONAL_DATA_XPATH)).click();
        Assertions.assertEquals("Форум", driver.findElement(By.xpath(ForumLocator.TITLE_XPATH)).getText());
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
