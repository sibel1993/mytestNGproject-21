package com.techproed.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Day06_TestNGAnnotations {
    //@Test: create test case
    //@beforeMethod: runs before ech method same as @before in Junit
    @BeforeMethod
    public void setUp(){
        System.out.println("Set Up METHOD ");
    }
    @Test(priority = 3)
    public void test1(){
        System.out.println("Test 1");

    }
    //IGNORE :SKIP TAST CASE
    @Ignore
    @Test
    public void test2(){
        System.out.println("Test 2");
    }
    @Test(priority = 1)
    public  void Test3(){
        System.out.println("Test 3");
    }
    @Test(priority = 2)
    public  void Test4(){
        System.out.println("Test 4");
    }

    //    @AfterMethod : Runs after each @Test annotation(after each method)
//    Same as @After in JUnit
    @AfterMethod
    public void tearDown(){
        System.out.println("Tear Down");
    }
    //By default , @Test runs in alphabetical order
    //we can use @Test(priority=1) prioritize test cases
}
