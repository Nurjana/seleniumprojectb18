package test.HomeWork;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utilities.SmartBearUtilities;
import utilities.WebDriverFactory;

import java.util.concurrent.TimeUnit;

public class Task_4_5 {

    WebDriver driver;

    @BeforeMethod
    public void setUp(){
        //TC #1: Smartbear software link verification
        //1. Open browser
        //2. Go to website:
        //http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx
        driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        SmartBearUtilities.login(driver);

    }

    @Test
    public void verifyOrder(){


    }



}
/*
PRACTICE #4: Method: verifyOrder
• Create a method named verifyOrder in SmartBearUtils class.
• Method takes WebDriver object and String(name).
• Method should verify if given name exists in orders.
• This method should simply accepts a name(String), and assert whether
given name is in the list or not.
• Create a new TestNG test to test if the method is working as expected.

Practice #5: Method: printNamesAndCities
• Create a method named printNamesAndCities in SmartBearUtils class.
• Method takes WebDriver object.
• This method should simply print all the names in the List of All Orders.
• Create a new TestNG test to test if the method is working as expected.
• Output should be like:
• Name1: name , City1: city
• Name2: name , City2: city
 */