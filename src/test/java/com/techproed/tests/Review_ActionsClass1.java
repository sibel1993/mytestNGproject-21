package com.techproed.tests;

import com.techproed.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Review_ActionsClass1 extends TestBase {
    @Test
    public void contextClickMethod(){
        //    Create a class: ActionsClass1
//    Create a test method : contextClickMethod() and test the following scenario:
//    Given user is on the https://the-internet.herokuapp.com/context_menu
//    When use Right clicks on the box
//    Then verify the alert message is “You selected a context menu”
//    Then accept the alert

        //    Given user is on the https://the-internet.herokuapp.com/context_menu
        driver.get("https://the-internet.herokuapp.com/context_menu");
        //    When use Right clicks on the box
       WebElement box= driver.findElement(By.id("hot-spot"));

        Actions action=new Actions(driver);
        action.contextClick(box).perform();
        //    Then verify the alert message is “You selected a context menu”
        String getMessage=driver.switchTo().alert().getText();
        Assert.assertEquals(getMessage,"You selected a context menu");
        driver.switchTo().alert().accept();


    }

}
