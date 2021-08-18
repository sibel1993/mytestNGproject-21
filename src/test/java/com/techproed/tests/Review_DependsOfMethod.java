package com.techproed.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Review_DependsOfMethod {
    @Test
    public void logIn(){
        System.out.println("Login Test");
        Assert.assertTrue(true);
    }
    @Test(dependsOnMethods = "logIn")
    public void homepage(){
        System.out.println("HomePage Test");
    }
    @Test(priority = 1)
    public void search(){
        System.out.println("Search Test");
    }
    @Test(priority = 2)
    public void searchResultMethod(){
        System.out.println("SearchResult Test");
    }

}
