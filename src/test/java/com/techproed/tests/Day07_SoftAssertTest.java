package com.techproed.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.concurrent.TimeUnit;

public class Day07_SoftAssertTest {
    WebDriver driver;
    @BeforeMethod
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("http://www.google.com");
    }
    @Test
    public void softAssertTest(){
        //TC01:SEARCH FOR" iphone 12" AND VERFY title contains 'iphone'
        driver.findElement(By.name("q")).sendKeys("iphone 12"+ Keys.ENTER);
        String Title1=driver.getTitle();

        //STEP 1: Create softAssert object
        SoftAssert softAssert=new SoftAssert();
        softAssert.assertTrue(Title1.contains("iphone"));
     //   Assert.assertTrue(Title1.contains("iphone"));

        //TC02: VERiFY title contains 'porcelain teapot'
        softAssert.assertTrue(Title1.contains("porcelain teapot"));
      //  Assert.assertTrue(Title1.contains("porcelain teapot"));
        //since line 32 failed ,rest of the code not run .execution stops on line 32

        //TC01: VERiFY title contains 'flower '
        softAssert.assertTrue(Title1.contains("flower "));
     //   Assert.assertTrue(Title1.contains("flower"));
        //STEP3: AssertAll to mark the test case as PASS or FAiL
        softAssert.assertAll();
    }
    @AfterMethod
    public void tearDown(){
        driver.quit();
    }


}
