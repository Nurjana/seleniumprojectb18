package test.day8_alerts_frames_windows;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import utilities.WebDriverFactory;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class DropDownPractice {
    WebDriver driver;

    @BeforeClass
    public void setUo(){
        driver= WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/dropdown");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);

    }

    @Test
    public void month_dropdown_default(){
        //locating the dropdown
        Select monthDropdown=new Select(driver.findElement(By.xpath("//select[@id='month']")));

        //creating actual and expected values
        String actualDropdown=monthDropdown.getFirstSelectedOption().getText();
        System.out.println("Actual dropdown "+actualDropdown);
        String expectedDropDown= LocalDateTime.now().getMonth().name();
        System.out.println("Expected dropdown "+expectedDropDown);
//        System.out.println(actualDropdown);
//        System.out.println(expectedDropDown);
        //1st way of doing assertion
        Assert.assertEquals(actualDropdown.toLowerCase(),expectedDropDown.toLowerCase());
        //2nd way
        Assert.assertTrue(actualDropdown.equalsIgnoreCase(expectedDropDown));

        //Practice #8
        List<WebElement> actualDropDownOptions=monthDropdown.getOptions();
        List<String> expectedDropdownOptions = Arrays.asList("January", "February", "March", "April", "May", "June", "July"
                , "August", "September", "October", "November", "December");

        List<String> actualMonthText=new ArrayList<>();
        for (WebElement each: actualDropDownOptions){
            actualMonthText.add(each.getText());
        }
        Assert.assertEquals(actualMonthText,expectedDropdownOptions);



    }
}
