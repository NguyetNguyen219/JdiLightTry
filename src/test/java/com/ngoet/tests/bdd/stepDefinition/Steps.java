package com.ngoet.tests.bdd.stepDefinition;

import com.ngoet.entities.User;
import com.ngoet.site.SiteJdi;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static com.epam.jdi.light.elements.init.PageFactory.initElements;
import static com.epam.jdi.tools.Timer.waitCondition;
import static com.ngoet.site.SiteJdi.homePage;
import static com.ngoet.site.page.HomePage.*;

public class Steps {
    private final String name = "ROMAN IOVLEV";

    @Before
    public void setup() {
        initElements(SiteJdi.class);
    }

    @Given("^Application is opened in browser$")
    public void open_application() {
        homePage.open();
        waitCondition(() -> userIcon.isDisplayed());
    }

    @When("^Enter the username \"(.*)\" and password \"(.*)\"$")
    public void input_login_info(String username, String password) {
        homePage.checkOpened();

        userIcon.click();
        loginForm.loginAs(new User(username, password));
    }

    @Then("^Roman's name is displayed on top bar$")
    public void check_username() {
        userName.is().text(name);
    }

    @When("^Enter wrong username and password$")
    public void input_wrong_login_info() {
        homePage.checkOpened();

        userIcon.click();
        loginForm.loginAs(new User("Invalid name", "invalid"));
    }

    @Then("^Error message is displayed$")
    public void check_error_login_message() {
        errorLoginMessage.is().displayed();
    }
}
