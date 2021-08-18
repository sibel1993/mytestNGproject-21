package com.techproed.tests;

import com.techproed.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.nio.file.Files;
import java.nio.file.Paths;

public class Day09_FileDownLoadTest extends TestBase {
    @Test
    public void downloadTest(){
//        Create a class:FileDownloadTest
//        downloadTest()
//        In the downloadTest() method, do the following test:
//        Go to https://the-internet.herokuapp.com/download
//        Download flower.jpeg file
//        Then verify if the file downloaded successfully
        driver.get("https://the-internet.herokuapp.com/download");

        WebElement flover=driver.findElement(By.linkText("flower.jpeg"));
        //        Then verify if the file downloaded successfully


        //i know know the flower.jpeg will be in Dowloads  folder if download is successfully
        //to verify if a path ecxist in out dowloand folder i follow these steps
        //1. find the of flower .jpeg file
        String flowerPath=System.getProperty("user.home")+"\\Desktop";

        boolean isExist= Files.exists(Paths.get(flowerPath));
        Assert.assertTrue(isExist);



    }
}
