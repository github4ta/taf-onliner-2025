package by.onliner;

import by.onliner.pages.HomePage;
import by.onliner.pages.PravilaVozvrataTovarovDenegPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PravilaVozvrataTovarovDenegTest extends BaseTest {
    @Test
    public void testPravilaVozvrataTovarovIDenegOpened() {

        HomePage homePage = new HomePage(driver);
        homePage.clickReturnPolicy();

        PravilaVozvrataTovarovDenegPage pravilaVozvrataTovarovDenegPage = new PravilaVozvrataTovarovDenegPage(driver);
        String expectedResult = "Правила возврата товаров и денег";
        Assertions.assertEquals(expectedResult, pravilaVozvrataTovarovDenegPage.getTextHeader());

    }

    @Test
    public void testFieldName() {
        HomePage homePage = new HomePage(driver);
        homePage.clickReturnPolicy();
        PravilaVozvrataTovarovDenegPage pravilaVozvrataTovarovDenegPage = new PravilaVozvrataTovarovDenegPage(driver);
        Assertions.assertEquals("Ваше имя и фамилия:", pravilaVozvrataTovarovDenegPage.getTextFieldName());
    }

    @Test
    public void testFieldEmail() {
        HomePage homePage = new HomePage(driver);
        homePage.clickReturnPolicy();
        PravilaVozvrataTovarovDenegPage pravilaVozvrataTovarovDenegPage = new PravilaVozvrataTovarovDenegPage(driver);
        Assertions.assertEquals("Электронная почта:", pravilaVozvrataTovarovDenegPage.getTextFieldEmail());
    }

    @Test
    public void testFieldTypeOfProblem() {
        HomePage homePage = new HomePage(driver);
        homePage.clickReturnPolicy();
        PravilaVozvrataTovarovDenegPage pravilaVozvrataTovarovDenegPage = new PravilaVozvrataTovarovDenegPage(driver);
        Assertions.assertEquals("Тип проблемы:", pravilaVozvrataTovarovDenegPage.getTextFieldTypeOfProblem());
    }

    @Test
    public void testFieldWhere() {
        HomePage homePage = new HomePage(driver);
        homePage.clickReturnPolicy();
        PravilaVozvrataTovarovDenegPage pravilaVozvrataTovarovDenegPage = new PravilaVozvrataTovarovDenegPage(driver);
        Assertions.assertEquals("Где:", pravilaVozvrataTovarovDenegPage.getTextFieldWhere());
    }

    @Test
    public void testFieldShortDescription() {
        HomePage homePage = new HomePage(driver);
        homePage.clickReturnPolicy();
        PravilaVozvrataTovarovDenegPage pravilaVozvrataTovarovDenegPage = new PravilaVozvrataTovarovDenegPage(driver);
        Assertions.assertEquals("Краткое описание:", pravilaVozvrataTovarovDenegPage.getTextFieldShortDescription());
    }

    @Test
    public void testFieldDetailedDescription() {
        HomePage homePage = new HomePage(driver);
        homePage.clickReturnPolicy();
        PravilaVozvrataTovarovDenegPage pravilaVozvrataTovarovDenegPage = new PravilaVozvrataTovarovDenegPage(driver);
        Assertions.assertEquals("Краткое описание:", pravilaVozvrataTovarovDenegPage.getTextFieldDetailedDescription());
    }

    @Test
    public void testFieldCaptcha() {
        HomePage homePage = new HomePage(driver);
        homePage.clickReturnPolicy();
        PravilaVozvrataTovarovDenegPage pravilaVozvrataTovarovDenegPage = new PravilaVozvrataTovarovDenegPage(driver);
        Assertions.assertEquals("Символы на картинке:", pravilaVozvrataTovarovDenegPage.getTextFieldCaptcha());
    }

}
