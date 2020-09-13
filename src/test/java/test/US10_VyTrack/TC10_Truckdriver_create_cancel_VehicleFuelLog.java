package test.US10_VyTrack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import utilities.WebDriverFactory;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class TC10_Truckdriver_create_cancel_VehicleFuelLog {
    WebDriver driver;

//    @AfterMethod
//    public void tearDown() throws InterruptedException{
//        Thread.sleep(2000);
//        driver.close();
//    }

    @BeforeClass
    public void setUp() {
        driver = WebDriverFactory.getDriver("Chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://qa2.vytrack.com/user/login");
    }
    @Test(priority = 1)
    public void login() {
        WebElement username = driver.findElement(By.xpath("//input[@name='_username']"));
        username.sendKeys("user27");
        WebElement password = driver.findElement(By.xpath("//input[@name='_password']"));
        password.sendKeys("UserUser123");
        WebElement login = driver.findElement(By.xpath("//button[@name='_submit']"));
        login.click();
    }
    @Test(priority = 2)

    public void vehicleFuelLogs() throws InterruptedException {
        Thread.sleep(2000 );
        WebElement fleet = driver.findElement(By.xpath("(//span[@class='title title-level-1'])[1]"));
        fleet.click();
        Thread.sleep(2000 );
        WebElement  VehicleFuelLog = driver.findElement(By.linkText("Vehicles Fuel Logs"));
        Thread.sleep(2000);
        VehicleFuelLog.click();
        WebElement vehiclesModel = driver.findElement(By.xpath("//h1[@class='oro-subtitle']"));
        // Assert.assertEquals(vehiclesModel.getText(), "Vehicle Model"); // first option
        Assert.assertTrue(vehiclesModel.isDisplayed()); // second option
         }

         @Test
         public void verifyColumnOrder( WebDriver driver, String tableId, ArrayList<String> columnHeaderList) {

             String expectedHeaders = String.join(" ", columnHeaderList);
             WebElement visibleHeaders =driver.findElement(By.xpath("//tr[@class='grid-header-row']//th"));

             Assert.assertEquals(visibleHeaders, expectedHeaders);
         }
//    @Test(priority = 3)
//    public void create_cancel() {
//        WebElement create= driver.findElement(By.xpath())
//    }

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