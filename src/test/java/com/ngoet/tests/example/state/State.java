package com.ngoet.tests.example.state;

import com.ngoet.entities.Default;
import io.qameta.allure.Step;

import static com.epam.jdi.tools.Timer.waitCondition;
import static com.ngoet.site.page.HomePage.loginForm;
import static com.ngoet.site.page.HomePage.userIcon;

public class State {

    @Step
    public static void login() {
        userIcon.click();
        waitCondition(() -> loginForm.isDisplayed());
        loginForm.loginAs(Default.getDefaultUser());
    }
}
