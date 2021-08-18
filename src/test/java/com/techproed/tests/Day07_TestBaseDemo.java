package com.techproed.tests;

import com.techproed.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Day07_TestBaseDemo extends TestBase {
    //we are using TestBase
    //BeforeMethod and AfterMethod automatically runs
    //this test is now cleaner
//    Create a class:TestBaseDemo
//    Create two methods: test1, test2
//    test1 search “porcelain teapot” on google
//    Then verify page contains “porcelain teapot”
//            ——————————-
//    test2 search “porcelain teapot” on amazon
//    Then verify page contains “porcelain teapot”
    @Test
    public void test1(){
        //    Create two methods: test1, test2
      //    test1 search “porcelain teapot” on google
      //    Then verify page contains “porcelain teapot”
        driver.get("https:www.google.com");
        driver.findElement(By.name("q")).sendKeys("porcelain teapot"+ Keys.ENTER);
        //    Then verify page contains “porcelain teapot”
       Assert.assertTrue( driver.getPageSource().contains("porcelain teapot"));

    }
    //    test2 search “porcelain teapot” on amazon
    @Test
    public void test2(){
        driver.get("https://www.amazon.com");
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("porcelain teapot"+Keys.ENTER);
        Assert.assertTrue(driver.getPageSource().contains("porcelain teapot"));
    }
}
