package com.ngoet.test.example;

import com.ngoet.test.TestsInit;
import io.qameta.allure.Description;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.jdiai.tools.Timer.waitCondition;
import static com.ngoet.site.SiteJdi.homePage;
import static com.ngoet.site.page.HomePage.*;

public class ExampleTest implements TestsInit {
    private String name = "Roman";
    private String pwd = "Jdi1234";
    private String user = "ROMAN IOVLEV";

    @Description("Login as user to page")
    @Test
    public void loginPage() {
        homePage.open();
        waitCondition(() -> userIcon.isDisplayed());

        userIcon.click();
        loginName.sendKeys(name);
        loginPassword.sendKeys(pwd);
        enterBtn.click();

        userName.is().text(user);
//        Assert.assertEquals(userName.getText(), user);
    }
}
