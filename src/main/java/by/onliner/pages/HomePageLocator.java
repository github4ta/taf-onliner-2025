package by.onliner.pages;

import org.openqa.selenium.By;

public class HomePageLocator {

    public static final String SERVICE_SECTION = "(//a[@href='https://s.onliner.by/tasks'])[2]";
    public static final String AUTOBARAHOLKA_XPATH = "//ul[@class='b-main-navigation']/li[3]/a";
    public static String aboutCompanyLinkXPath = "//a[@href='https://blog.onliner.by/about']";
    public static final String VACANCY_BTN = "//a[@href='https://blog.onliner.by/vacancy']";
    public static final By BARAHOLKA_BUTTON_XPATH = By.xpath("//a[@href=\"https://baraholka.onliner.by/\"]");
    public static final String CONTACTS_XPATH = "//li[@class='footer-style__item']/a[contains(text(),'Контакты редакции')]";
    public static final String RETURN_POLICY = "//a[@href='https://blog.onliner.by/pravila-vozvrata-tovarov-i-deneg']";
    public final static String FORUM_XPATH = "//a[@href='https://forum.onliner.by/']/span[@class='b-main-navigation__text']";
    public final static String PERSONAL_DATA_XPATH = "//button[@aria-label='Соглашаюсь']/p[@class='fc-button-label']";
    public static final String COPYRIGHTS = ".footer-style__copy";
    public static final String BTN_USER_SUPPORT = "//a[@href='https://support.onliner.by']";
}
