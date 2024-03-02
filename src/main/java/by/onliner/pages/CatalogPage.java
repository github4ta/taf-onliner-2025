package by.onliner.pages;

import by.onliner.driver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CatalogPage {
    private final String CATALOG_HEADER = "//div[@class =\"catalog-navigation__title\"]";
    private final String GARDEN_AND_HOME = "//li[@data-id=\"5\"]";
    private final String DECOR_AND_INTERIOR = "//*[@id=\"container\"]/div/div/div/div/div[1]/div[4]/div/div[7]/div[1]/div/div[10]/div[1]";
    private final String HOME_FLOWERS = "//*[@id=\"container\"]/div/div/div/div/div[1]/div[4]/div/div[7]/div[1]/div/div[10]/div[2]/div/a[6]/span/span[2]";
    private final String PRIVACY_POLICY_ACCEPT = "/html/body/div[6]/div[2]/div[1]/div[2]/div[2]/button[1]/p";
    private WebDriver driver;

    public CatalogPage() {
        this.driver = Driver.getDriver();
    }

    public String getCatalogPageHeader() {
        String headerText = driver.findElement(By.xpath(CATALOG_HEADER)).getText();
        return headerText;
    }

    public void clickGardenAndHomeMenu() {
        driver.findElement(By.xpath(GARDEN_AND_HOME)).click();
    }

    public void clickDecorAndInteriorItem() {
        driver.findElement(By.xpath(DECOR_AND_INTERIOR)).click();
    }

    public void clickHouseFlowersItem() {
        driver.findElement(By.xpath(HOME_FLOWERS)).click();
    }
    public void acceptPrivacyPolicy() {
        driver.findElement(By.xpath(PRIVACY_POLICY_ACCEPT)).click();
    }
}
