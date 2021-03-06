package com.ngoet.tests;

import com.epam.jdi.light.driver.WebDriverUtils;
import com.ngoet.site.SiteJdi;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import static com.epam.jdi.light.driver.WebDriverFactory.quit;
import static com.epam.jdi.light.elements.init.PageFactory.initElements;
import static com.epam.jdi.tools.Timer.waitCondition;
import static com.ngoet.site.SiteJdi.homePage;
import static com.ngoet.site.page.HomePage.userIcon;

public interface TestsInit {
    @BeforeSuite
    default void setUp() {
        initElements(SiteJdi.class);
    }

    @BeforeMethod
    default void openPage() {
        homePage.open();
        waitCondition(() -> userIcon.isDisplayed());
    }

    @AfterMethod
    default void close() {
        quit();
    }

    @AfterSuite
    default void tearDown() {
        WebDriverUtils.killAllSeleniumDrivers();
    }
}
