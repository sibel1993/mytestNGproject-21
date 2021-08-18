package com.techproed.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Review_SoftAsserTest {
    WebDriver driver;
    @BeforeMethod
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://www.google.com");


    }

    @Test
    public void softAssertTest(){
        //TC01:SEARCH FOR" iphone 12" AND VERFY title contains 'iphone'
        driver.findElement(By.name("q")).sendKeys("iphone 12"+ Keys.ENTER);
        String title1=driver.getTitle();
        Assert.assertTrue(title1.contains("iphone"));

        Assert.assertTrue(title1.contains("porcelain teapot"));

        Assert.assertTrue(title1.contains("flower"));


    }
}
