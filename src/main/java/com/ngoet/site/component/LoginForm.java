package com.ngoet.site.component;

import com.epam.jdi.light.common.JDIAction;
import com.epam.jdi.light.elements.composite.Form;
import com.epam.jdi.light.ui.html.elements.common.Button;
import com.epam.jdi.light.ui.html.elements.common.TextField;
import com.ngoet.entities.User;

public class LoginForm extends Form<User> {
    public TextField name;
    public TextField password;

//    @UI("#login-button")
    public Button loginButton;

    @JDIAction(value = "Login as {0}", timeout = 0)
    public void loginAs(User user) {
        name.sendKeys(user.getName());
        password.sendKeys(user.getPassword());
        loginButton.click();
    }
}
