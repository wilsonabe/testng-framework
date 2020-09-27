package com.orphynova.demo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTests {

    @Test(priority = 1,testName = "VALID Credentials Login Test")
    public void logintest(){
        System.out.println("Login with valid user name and password");

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
