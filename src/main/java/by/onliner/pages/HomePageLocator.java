package by.onliner.pages;

import org.openqa.selenium.By;

public class HomePageLocator {

    public static final String LOCATOR = "you locator to the link web element";
    public static final By CATALOG_BTN = By.cssSelector(".b-top-menu a[href='https://catalog.onliner.by']");
    public static final String AUTOBARAHOLKA_XPATH = "//ul[@class='b-main-navigation']/li[3]/a";
    public static String aboutCompanyLinkXPath = "//a[@href='https://blog.onliner.by/about']";
    public static final String VACANCY_BTN = "//a[@href='https://blog.onliner.by/vacancy']";
    public static final By BARAHOLKA_BUTTON_XPATH = By.xpath("//a[@href=\"https://baraholka.onliner.by/\"]");
    public static final String CONTACTS_XPATH = "\"//*[contains(text(),\"Контакты редакции\")]\"";
    public final static String  FORUM_XPATH = "//a[@href='https://forum.onliner.by/']/span[@class='b-main-navigation__text']";
    public final static String  PERSONAL_DATA_XPATH = "//button[@aria-label='Соглашаюсь']/p[@class='fc-button-label']";
}
