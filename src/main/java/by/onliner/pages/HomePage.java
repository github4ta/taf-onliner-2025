package by.onliner.pages;

import org.openqa.selenium.By;

public class HomePage {
    public void vacancyBtnClick() {
        driver.findElement(By.xpath(HomePageLocator.VACANCY_BTN)).click();
    }
}
