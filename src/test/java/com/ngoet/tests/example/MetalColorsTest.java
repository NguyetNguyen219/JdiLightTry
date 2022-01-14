package com.ngoet.tests.example;

import com.ngoet.tests.TestsInit;
import io.qameta.allure.Description;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static com.ngoet.site.SiteJdi.*;
import static com.ngoet.site.page.MetalColorPage.*;
import static com.ngoet.tests.example.state.State.login;

public class MetalColorsTest implements TestsInit {
    private int oddNumber = 7;
    private int evenNumber = 4;

    @BeforeMethod
    public void loginPage() {
        homePage.open();
        login();
    }

    @Description("Try open the metal & colors page")
    @Test
    public void toMetalColorsPage() {
        metalColorMenuBtn.click();
        metalColorPage.checkOpened();

        pickOddNumber(oddNumber);
        pickEvenNumber(evenNumber);
        calculateBtn.click();

        Assert.assertEquals(getSummaryResultText().getText(),
                "Summary: " + (oddNumber + evenNumber));
    }
}
