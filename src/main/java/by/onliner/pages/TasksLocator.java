package by.onliner.pages;

public class TasksLocator {
    public static final String HEADER_ORDERS = "//div[@class='service-header__title service-header__title_huge']";
    public static final String SUBSECTION_NAME = "//a[text()='Туризм']/ancestor::div[@class='service-form__collapse-header']";
    public static final String SCROLL_TO_SECTION_TITLE = "//div[@class='service-form__label-title' and text()='Статус']";
    public static final String CHECKBOX = "//div[contains(@class,'service-form__collapse-item_opened')]//li[2]";
    public static final String OFFER_ITEM = "//div[@class='service-offers__data']/a";
    public static final String SERVICE_DETAIL = "//div[@class='service-summary__details-list']/a";
}
