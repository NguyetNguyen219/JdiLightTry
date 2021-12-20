package com.ngoet.site.page;

import com.epam.jdi.light.elements.common.Label;
import com.epam.jdi.light.elements.composite.WebPage;
import com.epam.jdi.light.elements.pageobjects.annotations.locators.UI;
import com.epam.jdi.light.ui.html.elements.common.Button;
import com.epam.jdi.light.ui.html.elements.common.Image;
import com.epam.jdi.light.ui.html.elements.common.TextField;
import org.openqa.selenium.WebElement;

public class HomePage extends WebPage {
    @UI("#user-icon")
    public static Image userIcon;

    @UI("#name")
    public static TextField loginName;

    @UI("#password")
    public static TextField loginPassword;

    @UI("#login-button")
    public static Button enterBtn;

    @UI("#user-name")
    public static Label userName;
}
