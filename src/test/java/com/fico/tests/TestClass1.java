package com.fico.tests;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

import java.io.File;

public class TestClass1 {

    @BeforeClass
    public void beforeClass(){
        System.out.print("beforeClass");
    }
    @AfterClass
    public void afterClass(){
        System.out.print("afterClass");
    }
    @BeforeMethod
    public void beforeMethod(){
        System.out.print("beforeMethod");
    }
    @AfterMethod
    public void afterMethod(){
        System.out.print("afterMethod");
    }
    @BeforeTest
    public void beforeTest(){
        System.out.print("beforeTest");
    }
    @AfterTest
    public void afterTest(){
        System.out.print("afterTest");
    }

    @DataProvider(name = "numbers")
    public static Object[][] numbersData(){
        return new Object[][]{{1,1},{2,2},{3,3}};
    }
    @Test(dataProvider = "numbers")
    public void testCase1(int a , int b){
        System.out.print(randomMethod(a,b));
    }
    @Test
    public void testCase2(){
        System.out.print("test2");
    }
    public int randomMethod(int a ,int b){
        return a+b;
    }

}
