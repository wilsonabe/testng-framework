package com.orphynova.demo;

import org.testng.annotations.DataProvider;

public class TestData {

    @DataProvider(name = "userInfo")
    public Object[][] loginInfo(){
        return new Object[][] {
                {"john","123john"},
                {"mary","123mary"},
                {"sanjay","123sanjay"}
        };
        //can also be written as (longer version)
//        Object[][] data = new Object[][] {{"john","123john"},
//                                          {"mary","123mary"},
//                                          {"sanjay","123sanjay"}};
//        return data;

    };
}
