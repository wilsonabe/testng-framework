package com.orphynova.demo;

import org.testng.Assert;
import org.testng.annotations.*;

import java.sql.SQLOutput;

public class LoginTests {

    @BeforeSuite
    public void beforeSuite(){
        System.out.println("Code executed once before Suite");
    }

    @AfterSuite
    public void afterSuite(){
        System.out.println("Code executed once after Suite");
    }

    @Parameters({"browser","os"})
    @BeforeTest
    public void beforeTest(String browser,String os){
        System.out.println(" Code executed once before tests");
        System.out.println("Browser is  :" + browser);
        System.out.println("Operating system is : " + os);
    }
    @AfterTest
    public void afterTest(){
        System.out.println(" Code executed once after tests");
    }

    @BeforeClass
    public void beforeClass(){
        System.out.println("Method executed once before all methods");
    }
    @AfterClass
    public void afterClass(){
        System.out.println("Method executed once after class");
    }
    @AfterMethod
    public void afterMethod(){
        System.out.println("After method executed after all tests");
    }

    @BeforeMethod
    public void beforemethod(){
        System.out.println("Before Method executed prior to each test");
    }

    @Test(priority = 1,testName = "VALID Credentials Login Test",
            dataProvider = "userInfo",
             dataProviderClass = TestData.class)
    public void logintest(String username, String password){
        System.out.println("Login with valid user name and password");
        System.out.println("User name :" +username+ "  password :"+ password);
        String exp = "Hello";
        String act = "Hello";
        Assert.assertEquals(exp,act,"The strings dont match");
    }
    @Test(priority = 2,testName = "INVALID Credentials Login Test")
    public void invalidLoginTest(){
        System.out.println("Login test with invalid user name and password unsuccessful");
        Assert.fail("This test failed");
    }

    @Test(priority = 3,testName = "Verify Home page")
    public void homePageTest(){
        System.out.println("Home page test ");
        String exp = "Homepage";
        String act = "Homepage";
        Assert.assertTrue(exp == act,"Homepage test is valid");
    }

    @Test(priority = 4,testName = "Test for logout")
    public void logOutTest(){
        System.out.println("Logout test");
    }

}
