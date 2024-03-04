package by.onliner;

import by.onliner.pages.HomePage;
import by.onliner.pages.PravilaVozvrataTovarovIDenegPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PravilaVozvrataTovarovDenegTest extends BaseTest {
    @Test
    public void testPravilaVozvrataTovarovIDenegOpened() {

        HomePage homePage = new HomePage();
        homePage.clickReturnPolicy();
        PravilaVozvrataTovarovIDenegPage pravilaVozvrataTovarovIDenegPage = new PravilaVozvrataTovarovIDenegPage(driver);
        String expectedResult = "Правила возврата товаров и денег";
        Assertions.assertEquals(expectedResult, pravilaVozvrataTovarovIDenegPage.getTextHeader());
    }

    @Test
    public void testFieldName() {
        HomePage homePage = new HomePage();
        homePage.clickUserSupport();
        PravilaVozvrataTovarovIDenegPage pravilaVozvrataTovarovIDenegPage = new PravilaVozvrataTovarovIDenegPage(driver);
        Assertions.assertEquals("Ваше имя и фамилия:", pravilaVozvrataTovarovIDenegPage.getTextFieldName());
    }

    @Test
    public void testFieldEmail() {
        HomePage homePage = new HomePage();
        homePage.clickUserSupport();
        PravilaVozvrataTovarovIDenegPage pravilaVozvrataTovarovIDenegPage = new PravilaVozvrataTovarovIDenegPage(driver);
        Assertions.assertEquals("Электронная почта:", pravilaVozvrataTovarovIDenegPage.getTextFieldEmail());
    }

    @Test
    public void testFieldTypeOfProblem() {
        HomePage homePage = new HomePage();
        homePage.clickUserSupport();
        PravilaVozvrataTovarovIDenegPage pravilaVozvrataTovarovIDenegPage = new PravilaVozvrataTovarovIDenegPage(driver);
        Assertions.assertEquals("Тип проблемы:", pravilaVozvrataTovarovIDenegPage.getTextFieldTypeOfProblem());
    }

    @Test
    public void testFieldWhere() {
        HomePage homePage = new HomePage();
        homePage.clickUserSupport();
        PravilaVozvrataTovarovIDenegPage pravilaVozvrataTovarovIDenegPage = new PravilaVozvrataTovarovIDenegPage(driver);
        Assertions.assertEquals("Где:", pravilaVozvrataTovarovIDenegPage.getTextFieldWhere());
    }

    @Test
    public void testFieldShortDescription() {
        HomePage homePage = new HomePage();
        homePage.clickUserSupport();
        PravilaVozvrataTovarovIDenegPage pravilaVozvrataTovarovIDenegPage = new PravilaVozvrataTovarovIDenegPage(driver);
        Assertions.assertEquals("Краткое описание:", pravilaVozvrataTovarovIDenegPage.getTextFieldShortDescription());
    }

    @Test
    public void testFieldDetailedDescription() {
        HomePage homePage = new HomePage();
        homePage.clickUserSupport();
        PravilaVozvrataTovarovIDenegPage pravilaVozvrataTovarovIDenegPage = new PravilaVozvrataTovarovIDenegPage(driver);
        Assertions.assertEquals("Подробное описание:", pravilaVozvrataTovarovIDenegPage.getTextFieldDetailedDescription());
    }

    @Test
    public void testFieldCaptcha() {
        HomePage homePage = new HomePage();
        homePage.clickUserSupport();
        PravilaVozvrataTovarovIDenegPage pravilaVozvrataTovarovIDenegPage = new PravilaVozvrataTovarovIDenegPage(driver);
        Assertions.assertEquals("Символы на картинке:", pravilaVozvrataTovarovIDenegPage.getTextFieldCaptcha());
    }

}
