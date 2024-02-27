package by.onliner.pages;

import org.openqa.selenium.By;

public class VacancyLocator {
    public static final String VACANCY_HEADER_XPATH="//div[@class='news-header__title']/h1";
    public static By vacancy = By.cssSelector(".news-text a");
    public static By vacancySections = By.xpath("//div[@class='news-text']/p");
}
