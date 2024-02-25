package by.onliner.pages;

import org.openqa.selenium.By;

public class ForumLocator {
    public final static String TITLE_XPATH = "//h1[@class='m-title']";
    public final static By FIRST_ELEMENT_IN_LIST_IMPORTANT_SECTION_CSS =By.cssSelector("div.h-hottopics>ul>li:nth-child(1)>h3>a");
    public final static By HEADING_FIRST_ELEMENT_IN_LIST_IMPORTANT_SECTION_CSS =By.cssSelector("h1.m-title>a");
}
