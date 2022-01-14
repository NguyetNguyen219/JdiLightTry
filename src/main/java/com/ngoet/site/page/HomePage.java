package com.ngoet.site.page;

import com.epam.jdi.light.elements.common.Label;
import com.epam.jdi.light.elements.composite.WebPage;
import com.epam.jdi.light.elements.pageobjects.annotations.locators.UI;
import com.epam.jdi.light.ui.html.elements.common.Image;
import com.ngoet.site.component.LoginForm;

public class HomePage extends WebPage {

//    @UI("#login-form")
    public static LoginForm loginForm;

    @UI("#user-icon")
    public static Image userIcon;

    @UI("#user-name")
    public static Label userName;

    @UI("#login-form > div > span")
    public static Label errorLoginMessage;
}
