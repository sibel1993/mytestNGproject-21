package com.techproed.tests;

import com.techproed.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Review_ActionClass3 extends TestBase {
    @Test
    public void keysUpDown(){
        driver.get("https://www.google.com");
        WebElement searchBox=driver.findElement(By.name("q"));
        Actions action=new Actions(driver);
        action.keyDown(searchBox, Keys.SHIFT).
                sendKeys("iPhone X prices").
                keyUp(searchBox,Keys.SHIFT).sendKeys("are so expensive ").doubleClick().
                perform();




       // searchBox.sendKeys("iPhone X prices");
    }
}
