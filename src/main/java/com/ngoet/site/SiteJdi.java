package com.ngoet.site;

import com.epam.jdi.light.elements.pageobjects.annotations.JSite;
import com.epam.jdi.light.elements.pageobjects.annotations.Title;
import com.epam.jdi.light.elements.pageobjects.annotations.Url;
import com.ngoet.site.page.HomePage;

@JSite("https://jdi-testing.github.io/jdi-light/")
public class SiteJdi {
    @Url("/index.html") @Title("Home page")
    public static HomePage homePage;
}
