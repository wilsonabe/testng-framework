package com.orphynova.demo;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ShoppingTest {

    @BeforeClass
    public void beforeClass(){
        System.out.println("Before CLass test executed once");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("After CLass test executed once");
    }


    @Test(priority = 10)
    public void productSearch(){
        System.out.println("Searching for a product");
            }

    @Test(priority = 20)
    public void addProducttoShoppingCart(){
        System.out.println("Product added to Shopping cart");
    }
}
