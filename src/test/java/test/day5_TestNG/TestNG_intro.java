package test.day5_TestNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNG_intro {

    @BeforeMethod
    public void setUp(){
        System.out.println("Before method is running...");
    }
    @AfterMethod
    public void tearDown(){
        System.out.println("");
    }

    @Test
    public void test1(){
        System.out.println("Test one is running...");
    }
    @Test
    public void test2(){
        System.out.println("Test 2 is running ...");
    }
}
