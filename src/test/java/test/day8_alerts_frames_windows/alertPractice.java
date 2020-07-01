package test.day8_alerts_frames_windows;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utilities.WebDriverFactory;

import java.util.concurrent.TimeUnit;

public class alertPractice {
    WebDriver driver;

    //1. Open browser
    //2. Go to website: http://practice.cybertekschool.com/dropdowns
    @BeforeMethod
    public void setUp() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://practice.cybertekschool.com/javascript_alerts");
    }
    @Test
    public void p1_information_alert_test(){
        //Click to “Click for JS Alert” button
        WebElement infoAlertButton=driver.findElement(By.xpath("//button[.='Click for JS Alert']"));
        //Click to “Click for JS Alert” button
        infoAlertButton.click();

        // Create alert instance and switch to it
        Alert alert=driver.switchTo().alert();

        //use alert to accept the alert
        alert.accept();

        WebElement resultPage=driver.findElement(By.xpath("//p[@id='result']"));

        Assert.assertTrue(resultPage.isDisplayed());
    }

    @Test
    public void p2_confirmation_alert_test(){
        WebElement confirmationAlertButton = driver.findElement(By.xpath("//button[.='Click for JS Confirm']"));

        confirmationAlertButton.click();

        Alert alert = driver.switchTo().alert();

        alert.dismiss();

        //locating result web element
        WebElement resultText = driver.findElement(By.xpath("//p[@id='result']"));
        //WebElement resultText2 = driver.findElement(By.id("result"));

        //Asserting the result text is displayed
        Assert.assertTrue(resultText.isDisplayed());
    }
}
/*
TC #1: Information alert practice
1. Open browser
2. Go to website: http://practice.cybertekschool.com/javascript_alerts
3. Click to “Click for JS Alert” button
4. Click to OK button from the alert
5. Verify “You successfuly clicked an alert” text is displayed.
 */