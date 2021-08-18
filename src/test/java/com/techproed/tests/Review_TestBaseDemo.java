package com.techproed.tests;

import com.techproed.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Review_TestBaseDemo extends TestBase {
    @Test
    public void Test1(){
        //    Create two methods: test1, test2
        //    test1 search “porcelain teapot” on google
        //    Then verify page contains “porcelain teapot”
        driver.get("https://www.google.com");
        driver.findElement(By.name("q")).sendKeys("porcelain teapot");
        //    Then verify page contains “porcelain teapot”
        Assert.assertTrue(driver.getPageSource().contains("porcelain teapot"));


    }
    @Test
    public void test2(){
        driver.get("https://www.amazon.com");
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("porcelain teapot"+ Keys.ENTER);
Assert.assertTrue(driver.getPageSource().contains("porcelain teapot"));

    }
}
