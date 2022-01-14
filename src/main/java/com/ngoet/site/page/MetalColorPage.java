package com.ngoet.site.page;

import com.epam.jdi.light.elements.composite.WebPage;
import com.epam.jdi.light.elements.pageobjects.annotations.locators.UI;
import com.epam.jdi.light.elements.pageobjects.annotations.locators.XPath;
import com.epam.jdi.light.ui.html.elements.common.Button;
import com.epam.jdi.light.ui.html.elements.common.Checkbox;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class MetalColorPage extends WebPage {

    @UI("#calculate-button")
    public static Button calculateBtn;
    @XPath("//ul[@class='panel-body-list results']")
    public static WebElement resultTextList;

    @UI("#p1")
    protected static Checkbox oddNumber1;
    @UI("#p2")
    protected static Checkbox oddNumber3;
    @UI("#p3")
    protected static Checkbox oddNumber5;
    @UI("#p4")
    protected static Checkbox oddNumber7;
    @UI("#p5")
    protected static Checkbox evenNumber2;
    @UI("#p6")
    protected static Checkbox evenNumber4;
    @UI("#p7")
    protected static Checkbox evenNumber6;
    @UI("#p8")
    protected static Checkbox evenNumber8;

    public static void pickOddNumber(int number) {
        switch (number) {
            case 1:
                oddNumber1.click();
                break;
            case 3:
                oddNumber3.click();
                break;
            case 5:
                oddNumber5.click();
                break;
            case 7:
                oddNumber7.click();
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + number);
        }
    }

    public static void pickEvenNumber(int number) {
        switch (number) {
            case 2:
                evenNumber2.click();
                break;
            case 4:
                evenNumber4.click();
                break;
            case 6:
                evenNumber6.click();
                break;
            case 8:
                evenNumber8.click();
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + number);
        }
    }

    public static WebElement getSummaryResultText() {
        return resultTextList.findElement(By.className("summ-res"));
    }
}
