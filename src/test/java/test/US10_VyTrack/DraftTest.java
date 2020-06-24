package test.US10_VyTrack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utilities.WebDriverFactory;

import java.util.concurrent.TimeUnit;

public class DraftTest {
    WebDriver driver;

    @AfterMethod
    public void tearDown() throws InterruptedException{
        Thread.sleep(2000);
        driver.close();
    }

    @BeforeMethod
    public void setUp(){

        //TC#1: Verifying “Simple dropdown” and “State selection” dropdown default values
        //1. Open Chrome browser
        //2. Go to http://practice.cybertekschool.com/dropdown
        driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://qa2.vytrack.com/user/login");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @Test
    public void test_loginPage(){
        driver.findElements(By.xpath("//input[@id='prependedInput']"));
        //driver.sendKeys
    }

}
/*
1.Verify that truck driver should be able to see all Vehicle Fuel information on the grid
2.Verify that truck driver should be able to create Vehicle Fuel logs or cancel it
3.Verify that truck driver should be able to Edit , delete Vehicle Fuel Logs or
add attachement , add event
4.Verfiy that truck driver should be able to reset the grid by clicking on Grid setting

Truck Drivers	user27 , user28 , user29	UserUser123	https://qa2.vytrack.com/user/login
Store Manager	storemanager69 , storemanager70	UserUser123	https://qa2.vytrack.com/user/login
Sales Manager	salesmanager128 , salesmanager129 , salesmanager130	UserUser123	https://qa2.vytrack.com/user/login

 */