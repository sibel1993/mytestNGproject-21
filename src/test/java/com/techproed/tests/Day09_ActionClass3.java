package com.techproed.tests;

import com.techproed.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Day09_ActionClass3 extends TestBase {
//    Create a class: ActionsClass3
//    Create test method : keysUpDown()
//    Go to google
//    Send iPhone X prices => convert small letter capital vice versa.
//    Highlight the search box by double clicking
    @Test
    public void keysUpDown(){
        driver.get("https://www.google.com");
        WebElement searchBox=driver.findElement(By.name("q"));
     //   searchBox.sendKeys("iphone X prices");//NORMAL SEARCH
        Actions actions=new Actions(driver);
       // actions.keyDown("WEBELEMENT","COOMOND KeysUp or KeysDown or KeysShift")
        actions.
                keyDown(searchBox, Keys.SHIFT).//pressing shift on keybord
                sendKeys("iphone X prices").//sending small letters and expectimg capitol letters
                keyUp(searchBox,Keys.SHIFT).//unpressing shift on keyboard
                sendKeys("too expensive").//sending normal letters becuse no longer pressing shift
                perform();                  //performing the task
    }
}
