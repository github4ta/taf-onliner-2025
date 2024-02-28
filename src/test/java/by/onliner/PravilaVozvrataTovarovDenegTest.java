package by.onliner;

import by.onliner.pages.HomePage;
<<<<<<< HEAD
import by.onliner.pages.PravilaVozvrataTovarovIDenegPage;
=======
import by.onliner.pages.PravilaVozvrataTovarovDenegPage;
>>>>>>> master
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PravilaVozvrataTovarovDenegTest extends BaseTest {
    @Test
    public void testPravilaVozvrataTovarovIDenegOpened() {

        HomePage homePage = new HomePage(driver);
        homePage.clickReturnPolicy();

<<<<<<< HEAD
        PravilaVozvrataTovarovIDenegPage pravilaVozvrataTovarovIDenegPage = new PravilaVozvrataTovarovIDenegPage(driver);
        String expectedResult = "Правила возврата товаров и денег";
        Assertions.assertEquals(expectedResult, pravilaVozvrataTovarovIDenegPage.getTextHeader());
=======
        PravilaVozvrataTovarovDenegPage pravilaVozvrataTovarovDenegPage = new PravilaVozvrataTovarovDenegPage(driver);
        String expectedResult = "Правила возврата товаров и денег";
        Assertions.assertEquals(expectedResult, pravilaVozvrataTovarovDenegPage.getTextHeader());

>>>>>>> master
    }

    @Test
    public void testFieldName() {
        HomePage homePage = new HomePage(driver);
<<<<<<< HEAD
        homePage.clickUserSupport();
        PravilaVozvrataTovarovIDenegPage pravilaVozvrataTovarovIDenegPage = new PravilaVozvrataTovarovIDenegPage(driver);
        Assertions.assertEquals("Ваше имя и фамилия:", pravilaVozvrataTovarovIDenegPage.getTextFieldName());
=======
        homePage.clickReturnPolicy();
        PravilaVozvrataTovarovDenegPage pravilaVozvrataTovarovDenegPage = new PravilaVozvrataTovarovDenegPage(driver);
        Assertions.assertEquals("Ваше имя и фамилия:", pravilaVozvrataTovarovDenegPage.getTextFieldName());
>>>>>>> master
    }

    @Test
    public void testFieldEmail() {
        HomePage homePage = new HomePage(driver);
<<<<<<< HEAD
        homePage.clickUserSupport();
        PravilaVozvrataTovarovIDenegPage pravilaVozvrataTovarovIDenegPage = new PravilaVozvrataTovarovIDenegPage(driver);
        Assertions.assertEquals("Электронная почта:", pravilaVozvrataTovarovIDenegPage.getTextFieldEmail());
=======
        homePage.clickReturnPolicy();
        PravilaVozvrataTovarovDenegPage pravilaVozvrataTovarovDenegPage = new PravilaVozvrataTovarovDenegPage(driver);
        Assertions.assertEquals("Электронная почта:", pravilaVozvrataTovarovDenegPage.getTextFieldEmail());
>>>>>>> master
    }

    @Test
    public void testFieldTypeOfProblem() {
        HomePage homePage = new HomePage(driver);
<<<<<<< HEAD
        homePage.clickUserSupport();
        PravilaVozvrataTovarovIDenegPage pravilaVozvrataTovarovIDenegPage = new PravilaVozvrataTovarovIDenegPage(driver);
        Assertions.assertEquals("Тип проблемы:", pravilaVozvrataTovarovIDenegPage.getTextFieldTypeOfProblem());
=======
        homePage.clickReturnPolicy();
        PravilaVozvrataTovarovDenegPage pravilaVozvrataTovarovDenegPage = new PravilaVozvrataTovarovDenegPage(driver);
        Assertions.assertEquals("Тип проблемы:", pravilaVozvrataTovarovDenegPage.getTextFieldTypeOfProblem());
>>>>>>> master
    }

    @Test
    public void testFieldWhere() {
        HomePage homePage = new HomePage(driver);
<<<<<<< HEAD
        homePage.clickUserSupport();
        PravilaVozvrataTovarovIDenegPage pravilaVozvrataTovarovIDenegPage = new PravilaVozvrataTovarovIDenegPage(driver);
        Assertions.assertEquals("Где:", pravilaVozvrataTovarovIDenegPage.getTextFieldWhere());
=======
        homePage.clickReturnPolicy();
        PravilaVozvrataTovarovDenegPage pravilaVozvrataTovarovDenegPage = new PravilaVozvrataTovarovDenegPage(driver);
        Assertions.assertEquals("Где:", pravilaVozvrataTovarovDenegPage.getTextFieldWhere());
>>>>>>> master
    }

    @Test
    public void testFieldShortDescription() {
        HomePage homePage = new HomePage(driver);
<<<<<<< HEAD
        homePage.clickUserSupport();
        PravilaVozvrataTovarovIDenegPage pravilaVozvrataTovarovIDenegPage = new PravilaVozvrataTovarovIDenegPage(driver);
        Assertions.assertEquals("Краткое описание:", pravilaVozvrataTovarovIDenegPage.getTextFieldShortDescription());
=======
        homePage.clickReturnPolicy();
        PravilaVozvrataTovarovDenegPage pravilaVozvrataTovarovDenegPage = new PravilaVozvrataTovarovDenegPage(driver);
        Assertions.assertEquals("Краткое описание:", pravilaVozvrataTovarovDenegPage.getTextFieldShortDescription());
>>>>>>> master
    }

    @Test
    public void testFieldDetailedDescription() {
        HomePage homePage = new HomePage(driver);
<<<<<<< HEAD
        homePage.clickUserSupport();
        PravilaVozvrataTovarovIDenegPage pravilaVozvrataTovarovIDenegPage = new PravilaVozvrataTovarovIDenegPage(driver);
        Assertions.assertEquals("Подробное описание:", pravilaVozvrataTovarovIDenegPage.getTextFieldDetailedDescription());
=======
        homePage.clickReturnPolicy();
        PravilaVozvrataTovarovDenegPage pravilaVozvrataTovarovDenegPage = new PravilaVozvrataTovarovDenegPage(driver);
        Assertions.assertEquals("Краткое описание:", pravilaVozvrataTovarovDenegPage.getTextFieldDetailedDescription());
>>>>>>> master
    }

    @Test
    public void testFieldCaptcha() {
        HomePage homePage = new HomePage(driver);
<<<<<<< HEAD
        homePage.clickUserSupport();
        PravilaVozvrataTovarovIDenegPage pravilaVozvrataTovarovIDenegPage = new PravilaVozvrataTovarovIDenegPage(driver);
        Assertions.assertEquals("Символы на картинке:", pravilaVozvrataTovarovIDenegPage.getTextFieldCaptcha());
=======
        homePage.clickReturnPolicy();
        PravilaVozvrataTovarovDenegPage pravilaVozvrataTovarovDenegPage = new PravilaVozvrataTovarovDenegPage(driver);
        Assertions.assertEquals("Символы на картинке:", pravilaVozvrataTovarovDenegPage.getTextFieldCaptcha());
>>>>>>> master
    }

}
