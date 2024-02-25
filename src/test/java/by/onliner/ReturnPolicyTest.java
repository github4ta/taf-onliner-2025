package by.onliner;

import by.onliner.pages.HomePage;
import by.onliner.pages.ReturnPolicy;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ReturnPolicyTest extends BaseTest {
    @Test
    public void checkReturnPolicyTest() {

        HomePage homePage = new HomePage(driver);
        homePage.clickReturnPolicy();

        ReturnPolicy returnPolicy = new ReturnPolicy(driver);
        String expectedResult = "Правила возврата товаров и денег";
        Assertions.assertEquals(expectedResult, returnPolicy.getTextHeader());

    }

}
