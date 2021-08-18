package com.techproed.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.nio.file.Files;
import java.nio.file.Paths;

public class Day09_FileExistTest {
    @Test
    public void isExist(){
        //We cannot automate desktop with selenium
        //but we can use JAVA to understand a file path exist in our computers
        String pathFile="C:\\Users\\aatil\\Desktop";

        //or we can get the path dynamic using java
        String homePath=System.getProperty("user.home");
        System.out.println(homePath);

        String pathOfFile=homePath+"\\Desktop";

        //check if the file exist on your computer?
      boolean isExist=  Files.exists(Paths.get(pathOfFile));//returns true if pathOfFile exist ,return false other wise
        Assert.assertTrue(isExist);

    }
}
