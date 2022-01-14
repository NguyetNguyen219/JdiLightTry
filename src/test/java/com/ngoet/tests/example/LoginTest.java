package com.ngoet.tests.example;

import com.ngoet.entities.User;
import com.ngoet.tests.TestsInit;
import io.qameta.allure.Description;
import org.testng.annotations.Test;

import static com.epam.jdi.tools.Timer.waitCondition;
import static com.ngoet.entities.Default.getDefaultUser;
import static com.ngoet.site.SiteJdi.homePage;
import static com.ngoet.site.page.HomePage.*;

public class LoginTest implements TestsInit {
    private String username = "ROMAN IOVLEV";


    @Description("Login with valid username & password")
    @Test
    public void validLogin() {
        homePage.checkOpened();

        userIcon.click();
//        waitCondition(() -> loginForm.isDisplayed());
        loginForm.is().displayed();
        loginForm.loginAs(getDefaultUser());

        userName.is().text(username);
    }

    @Description("Login with invalid username & password")
    @Test
    public void invalidLogin() {
        homePage.checkOpened();

        userIcon.click();
        loginForm.loginAs(new User("Invalid name", "invalid"));

        errorLoginMessage.is().displayed();
    }
}

