package by.onliner.pages;

import by.onliner.driver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static by.onliner.pages.HomePageLocator.COPYRIGHTS;

public class HomePage {
    WebDriver driver;

    public HomePage() {
        this.driver = Driver.getDriver();
    }

    private final String SERVICE_SECTION = "(//a[@href='https://s.onliner.by/tasks'])[2]";
    private final String LOCATOR = "you locator to the link web element";
    private final String CATALOG_BTN = ".b-top-menu a[href='https://catalog.onliner.by']";
    private final String AUTOBARAHOLKA_XPATH = "//ul[@class='b-main-navigation']/li[3]/a";
    private String aboutCompanyLinkXPath = "//a[@href='https://blog.onliner.by/about']";
    private final String VACANCY_BTN = "//a[@href='https://blog.onliner.by/vacancy']";
    private final By BARAHOLKA_BUTTON_XPATH = By.xpath("//a[@href=\"https://baraholka.onliner.by/\"]");
    private final String CONTACTS_XPATH = "//a[@href='https://people.onliner.by/contacts']";
    private final String RETURN_POLICY = "//a[@href='https://blog.onliner.by/pravila-vozvrata-tovarov-i-deneg']";
    private static String FORUM_XPATH = "//a[@href='https://forum.onliner.by/']/span[@class='b-main-navigation__text']";
    private static String PERSONAL_DATA_XPATH = "//button[@aria-label='Соглашаюсь']/p[@class='fc-button-label']";
    private final String COPYRIGHTS = ".footer-style__copy";
    private final String TWENTY_FOUR_HOURS_NEWS_XPATH = "//a[text()='Новое за 24 часа']";
    private final String CATALOG_ITEM = ".b-top-menu a[href='https://catalog.onliner.by']";

    public void openForum() {
        WebElement forumBtn = driver.findElement(By.xpath(HomePageLocator.FORUM_XPATH));
        forumBtn.click();
    }

    public void clickPolicy() {
        WebElement policy = driver.findElement(By.xpath(HomePageLocator.PERSONAL_DATA_XPATH));
        policy.click();
    }


    public void clickServiceSection() {
        driver.findElement(By.xpath(HomePageLocator.SERVICE_SECTION)).click();
    }

    public void vacancyBtnClick() {
        driver.findElement(By.xpath(HomePageLocator.VACANCY_BTN)).click();
    }

    public void clickBaraholkaButton(){
        driver.findElement(HomePageLocator.BARAHOLKA_BUTTON_XPATH).click();
    }

    public void openAboutCompanyPage() {
        WebElement aboutCompanyLink = driver.findElement(By.xpath(HomePageLocator.aboutCompanyLinkXPath));
        aboutCompanyLink.click();
    }

    public void contactsClick() {
        driver.findElement(By.xpath(CONTACTS_XPATH)).click();
    }

    public void clickReturnPolicy() {
        driver.findElement(By.xpath(RETURN_POLICY)).click();

    public void contactsClick(){  driver.findElement(By.xpath(HomePageLocator.CONTACTS_XPATH)).click();}
    public void clickReturnPolicy(){
        driver.findElement(By.xpath(HomePageLocator.RETURN_POLICY)).click();
    }

    public String getCopyrightsText() {
        return driver.findElement(By.cssSelector(COPYRIGHTS)).getText();
    }

    public void clickAutobaraholkaBtn() {
        driver.findElement(By.xpath(AUTOBARAHOLKA_XPATH)).click();
    }

    public void clickContactsOfEditorialOffice() {
        ContactsPage contactsPage=new ContactsPage(driver);
        driver.findElement(By.xpath(contactsPage.getCONTACTS_OF_EDITORIAL_OFFICE())).click();
    }

    public void clickTwentyFourHoursNews() {
        WebElement twentyFourHoursNewsLink = driver.findElement(By.xpath(TWENTY_FOUR_HOURS_NEWS_XPATH));
        twentyFourHoursNewsLink.click();
    }

    public void openCatalogItem() {
        driver.findElement(By.cssSelector(CATALOG_ITEM)).click();
    }
    public void openCatalogPage() {
        driver.findElement(By.cssSelector(CATALOG_BTN)).click();

    public void clickAutobaraholkaBtn(){driver.findElement(By.xpath(HomePageLocator.AUTOBARAHOLKA_XPATH)).click();
    }

    public void clickUserSupport() {
        driver.findElement(By.xpath(HomePageLocator.BTN_USER_SUPPORT)).click();
    }


}
