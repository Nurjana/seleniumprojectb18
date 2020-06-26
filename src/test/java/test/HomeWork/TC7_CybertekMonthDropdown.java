package test.HomeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utilities.WebDriverFactory;

import java.util.concurrent.TimeUnit;

public class TC7_CybertekMonthDropdown {
    WebDriver driver;

    //1. Open browser
    //2. Go to website: http://practice.cybertekschool.com/dropdowns
    @BeforeMethod
    public void setUp(){
       driver= WebDriverFactory.getDriver("chrome");
       driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
       driver.get("http://practice.cybertekschool.com/dropdown");
    }

    //3. Verify default value is always showing the current month
    @Test
    public void dropDownTest(){
        Select month = new Select(driver.findElement(By.xpath("//select[@id='month']")));
        Assert.assertEquals(month.getFirstSelectedOption().getText(), "June");

    }
}
/*
TC#7: Cybertek “month” dropdown default value
1. Open browser
2. Go to website: http://practice.cybertekschool.com/dropdowns
3. Verify default value is always showing the current month
o Expected: If currently in June, should show June selected.
 */
