package com.ngoet.site;

import com.epam.jdi.light.elements.pageobjects.annotations.JSite;
import com.epam.jdi.light.elements.pageobjects.annotations.Title;
import com.epam.jdi.light.elements.pageobjects.annotations.Url;
import com.epam.jdi.light.elements.pageobjects.annotations.locators.XPath;
import com.epam.jdi.light.ui.html.elements.common.Button;
import com.ngoet.site.page.HomePage;
import com.ngoet.site.page.MetalColorPage;

@JSite("https://jdi-testing.github.io/jdi-light/")
public class SiteJdi {

    @Url("/index.html") @Title("Home Page")
    public static HomePage homePage;

    @Url("/metals-colors.html") @Title("Metal and Colors")
    public static MetalColorPage metalColorPage;

    @XPath("//div[@id='mCSB_1_container']/ul/li[contains(@index, '4')]")
    public static Button metalColorMenuBtn;
}
