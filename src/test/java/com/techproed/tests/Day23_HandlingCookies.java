package com.techproed.tests;

import com.techproed.utilities.TestBase;
import org.openqa.selenium.Cookie;
import org.testng.annotations.Test;

import java.util.Set;

public class Day23_HandlingCookies extends TestBase {
    /*
-It is created by the browser temperarily.
-Cookies are stored in our computers as we visit the websites
-We can auotomete handling cookies:
   -find the cookies
   -add new cookies
   -delete cookies
   */
    @Test
    public void handleCookies(){

        driver.get("https://www.amazon.com");
       Set<Cookie> allCookies= driver.manage().getCookies();
       //1 find the total number of cookies
        int numOfCookies=allCookies.size();
        System.out.println("num of cookies"+numOfCookies);
        //print all cookies
        for (Cookie eachCookies:allCookies){
            System.out.println(eachCookies.getName());
            System.out.println(eachCookies.getValue());
        }
        //        3. Get cookies based on the name
        System.out.println("Cookie named i18n-prefs : "+driver.manage().getCookieNamed("i18n-prefs"));
       //add new cookie
        Cookie myCookies=new Cookie("my best cookies","123456");
        driver.manage().addCookie(myCookies);
        allCookies=driver.manage().getCookies();
        int newNumOfCookies=allCookies.size();
        System.out.println(newNumOfCookies);//8

        //delete cookies
        driver.manage().deleteCookieNamed("session-token");
        allCookies=driver.manage().getCookies();
        System.out.println(allCookies.size());
        //delete all cookies
        driver.manage().deleteAllCookies();
        allCookies=driver.manage().getCookies();
        System.out.println(allCookies.size());//0


    }

}
