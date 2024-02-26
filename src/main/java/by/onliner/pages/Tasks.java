package by.onliner.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import static by.onliner.pages.TasksLocator.*;

public class Tasks {
    private WebDriver driver;

    public Tasks(WebDriver driver) {
        this.driver = driver;
    }

    public String getTextHeader() {
        return driver.findElement(By.xpath(TasksLocator.HEADER_ORDERS)).getText();
    }

    public void clickMinsk() throws InterruptedException {
        driver.findElement(By.xpath(TasksLocator.MINSK_FILTER)).click();
        Thread.sleep(20000);
    }

    public void clickForAnimals() throws InterruptedException {
        driver.findElement(By.xpath(TasksLocator.SERVICES_FOR_ANIMALS)).click();
        Thread.sleep(20000);
    }

    public void clickHaircutForAnimals() throws InterruptedException{
        driver.findElement(By.xpath(TasksLocator.HAIRCUT_FOR_HOME_ANIMALS)).click();
        Thread.sleep(20000);
    }

    public void clickActiveStatus() throws InterruptedException{
        driver.findElement(By.xpath(TasksLocator.ACTIVE_STATUS)).click();
        Thread.sleep(20000);
    }

    public void clickFirstItemInSearch() {
        driver.findElement(By.xpath(TasksLocator.FIRST_ITEM_IN_SEARCH)).click();
    }

    public String compareTitle() {
        return driver.findElement(By.xpath(TasksLocator.TITLE)).getText();
    }

    public void selectSectionFromList() {
        WebElement element = driver.findElement(By.xpath(SCROLL_TO_SECTION_TITLE));
        new Actions(driver).scrollToElement(element).perform();
        driver.findElement(By.xpath(SUBSECTION_NAME)).click();
    }

    public void selectCheckbox() {
        driver.findElement(By.xpath(CHECKBOX)).click();
    }

    public void selectOffer() {
        driver.findElement(By.xpath(OFFER_ITEM)).click();
    }

    public String getServiceDetailText() {
        return driver.findElement(By.xpath(SERVICE_DETAIL)).getText();
    }
}
