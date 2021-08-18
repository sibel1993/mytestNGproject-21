package com.techproed.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Day07_DependsOnMethods {
    @Test
    public void logIn(){
        System.out.println("Login Test");
        Assert.assertTrue(false);
    }
    @Test(dependsOnMethods = "logIn")//login runs  before the homepage //homepage method only runs if login pass
                                    //otherwise homepage will be skipped
                                    //homepage depends on login method
    public void homePage(){
        System.out.println("Home Page Test");
    }
    @Test(priority = 1)
    public void search(){
        System.out.println("Search Test");
    }
    @Test(priority = 2)
    public  void searchResultMethod(){
        System.out.println("Search Result Method");
    }
}
