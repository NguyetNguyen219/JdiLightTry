package com.ngoet.test;

import com.epam.jdi.light.driver.WebDriverUtils;
import com.ngoet.site.SiteJdi;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import static com.epam.jdi.light.driver.WebDriverFactory.quit;
import static com.epam.jdi.light.elements.init.PageFactory.initElements;

public interface TestsInit {
    @BeforeSuite
    default void setUp() {
        initElements(SiteJdi.class);
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
