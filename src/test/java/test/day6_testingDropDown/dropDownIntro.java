package test.day6_testingDropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;
import utilities.WebDriverFactory;

import java.util.concurrent.TimeUnit;

public class dropDownIntro {

    WebDriver driver;

    @Ignore
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
        driver.get("http://practice.cybertekschool.com/dropdown");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @Test
    public void test1_default_value_verification(){

        //3. Verify “Simple dropdown” default selected value is correct
        //Expected: “Please select an option”
        Select simpleDropdown = new Select(driver.findElement(By.xpath("//select[@id='dropdown']")));

        String actualDefaultOfSimpleDropdown = simpleDropdown.getFirstSelectedOption().getText();
        String expectedDefaultOfSimpleDropdown = "Please select an option";

        Assert.assertEquals(actualDefaultOfSimpleDropdown, expectedDefaultOfSimpleDropdown);

        //4. Verify “State selection” default selected value is correct
        //Expected: “Select a State”

        Select stateDropDown=new Select(driver.findElement(By.xpath("//select[@id='state']")));
        String actualDefaultOfStateDropDown = stateDropDown.getFirstSelectedOption().getText();
        String expectedDefaultOfStateDropDown="Select a State";

        Assert.assertEquals(actualDefaultOfStateDropDown,expectedDefaultOfSimpleDropdown);
    }

    @Test
    public void test2_state_dropdown_verification(){

    }

}
/*
    TC#1: Verifying “Simple dropdown” and “State selection” dropdown default values
1. Open Chrome browser
2. Go to http://practice.cybertekschool.com/dropdown
3. Verify “Simple dropdown” default selected value is correct
Expected: “Please select an option”
4. Verify “State selection” default selected value is correct
Expected: “Select a State”
 */

/*
TC #2: Selecting state from State dropdown and verifying result
1. Open Chrome browser
2. Go to http://practice.cybertekschool.com/dropdown
3. Select Illinois
4. Select Virginia
5. Select California
6. Verify final selected option is California.
Use all Select options. (visible text, value, index)
 */