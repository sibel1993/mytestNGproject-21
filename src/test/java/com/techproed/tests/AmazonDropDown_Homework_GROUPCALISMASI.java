package com.techproed.tests;

import com.techproed.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class AmazonDropDown_Homework_GROUPCALISMASI extends TestBase {
    //CREATE A METHOD DROPDOWN TEST
    //GO TO https://www.amazon.com
    //find the element of dropdown element.HINT: By.id("searchDropDownBox")
    //print the first selected option and assert if it is equals "All Departments"
    //select the 4th option by index(index of 3) and assert if the name is "Amazon Devices".(after you select you
    // need to use get first selected option method
    //print all the dropdown options-get options(); method returns the List<WebElement> using loop
    //print all options
    //Print the total  number of options in the dropdown
    //Check if 'Appliances' is a dropdown option print True if "Appliances" is an option.Print false otherwise
    //BONUS:Check if the dropdown is in Alphabetical order
    @Test
    public void dropdownTest(){
        //CREATE A METHOD DROPDOWN TEST
        //GO TO https://www.amazon.com
        //find the element of dropdown element.HINT: By.id("searchDropDownBox")
        driver.get("https://www.amazon.com/");
        WebElement element =driver.findElement(By.id("searchDropdownBox"));
        element.click();

        //print the first selected option and assert if it is equals "All Departments"
        Select select1 = new Select(element);
        String selectedOption= select1.getFirstSelectedOption().getText();
        Assert.assertEquals(selectedOption,"All Departments");
        System.out.println("first selected element: "+selectedOption);

        //select the 4th option by index(index of 3) and assert if the name is "Amazon Devices".(after you select you
        // need to use get first selected option method
        select1.selectByIndex(3);
        String sel4th =select1.getFirstSelectedOption().getText();
        Assert.assertTrue(sel4th.equals("Amazon Devices"));
        System.out.println(sel4th);

        //print all the dropdown options-get options(); method returns the List<WebElement> using loop
        //print all options
        List<WebElement> options =select1.getOptions();
        for(WebElement eachoption:options){
            System.out.println(eachoption.getText());
        }

        // //Print the total  number of options in the dropdown
        int numberofoptions =options.size();
        System.out.println(numberofoptions);

        //Check if 'Appliances' is a dropdown option print True if "Appliances" is an option.Print false otherwise
        int count=0;
        for(WebElement eachoption:options){
            if(eachoption.getText().equals("Appliances")){
                count++;
            }
        }
        if(count>0){
            System.out.println("true");
        }else{
            System.out.println("false");
        }

        //BONUS:Check if the dropdown is in Alphabetical order


    }
}
