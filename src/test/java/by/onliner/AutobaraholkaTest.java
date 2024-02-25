package by.onliner;

import by.onliner.pages.AutobaraholkaPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AutobaraholkaTest extends BaseTest{

    @Test
    public void testAutobaraholkaOpened() {
        AutobaraholkaPage autobaraholka = new AutobaraholkaPage(driver);
        autobaraholka.clickAutobaraholkaBtn();
        autobaraholka.getAutobaraholkaTitle();
        Assertions.assertEquals("Автобарахолка", autobaraholka.getAutobaraholkaTitle());
    }
}
