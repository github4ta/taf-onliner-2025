package by.onliner;

import by.onliner.pages.HomePage;
import by.onliner.pages.ReturnPolicy;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PravilaVozvrataTovarovDenegTest extends BaseTest {
    @Test
    public void checkReturnPolicyTest() {

        HomePage homePage = new HomePage(driver);
        homePage.clickReturnPolicy();

        ReturnPolicy returnPolicy = new ReturnPolicy(driver);
        String expectedResult = "Правила возврата товаров и денег";
        Assertions.assertEquals(expectedResult, returnPolicy.getTextHeader());

    }

    @Test
    public void testFieldName() {
        HomePage homePage = new HomePage(driver);
        homePage.clickReturnPolicy();
        ReturnPolicy returnPolicy = new ReturnPolicy(driver);
        Assertions.assertEquals("Ваше имя и фамилия:", returnPolicy.getTextFieldName());
    }

    @Test
    public void testFieldEmail() {
        HomePage homePage = new HomePage(driver);
        homePage.clickReturnPolicy();
        ReturnPolicy returnPolicy = new ReturnPolicy(driver);
        Assertions.assertEquals("Электронная почта:", returnPolicy.getTextFieldEmail());
    }

    @Test
    public void testFieldTypeOfProblem() {
        HomePage homePage = new HomePage(driver);
        homePage.clickReturnPolicy();
        ReturnPolicy returnPolicy = new ReturnPolicy(driver);
        Assertions.assertEquals("Тип проблемы:", returnPolicy.getTextFieldTypeOfProblem());
    }

    @Test
    public void testFieldWhere() {
        HomePage homePage = new HomePage(driver);
        homePage.clickReturnPolicy();
        ReturnPolicy returnPolicy = new ReturnPolicy(driver);
        Assertions.assertEquals("Где:", returnPolicy.getTextFieldWhere());
    }

    @Test
    public void testFieldShortDescription() {
        HomePage homePage = new HomePage(driver);
        homePage.clickReturnPolicy();
        ReturnPolicy returnPolicy = new ReturnPolicy(driver);
        Assertions.assertEquals("Краткое описание:", returnPolicy.getTextFieldShortDescription());
    }

    @Test
    public void testFieldDetailedDescription() {
        HomePage homePage = new HomePage(driver);
        homePage.clickReturnPolicy();
        ReturnPolicy returnPolicy = new ReturnPolicy(driver);
        Assertions.assertEquals("Краткое описание:", returnPolicy.getTextFieldDetailedDescription());
    }

    @Test
    public void testFieldCaptcha() {
        HomePage homePage = new HomePage(driver);
        homePage.clickReturnPolicy();
        ReturnPolicy returnPolicy = new ReturnPolicy(driver);
        Assertions.assertEquals("Символы на картинке:", returnPolicy.getTextFieldCaptcha());
    }

}
