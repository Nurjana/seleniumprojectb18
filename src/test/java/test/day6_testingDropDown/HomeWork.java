package test.day6_testingDropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utilities.WebDriverFactory;

import java.util.concurrent.TimeUnit;


    public class HomeWork {
        //TC#1: Verifying “Simple dropdown” and “State selection” dropdown default values
// 1.Open Chrome browser
// 2.Go to http://practice.cybertekschool.com/dropdown
// 3.Verify “Simple dropdown” default selected value is correct
// Expected: “Please select an option”
// 4.Verify“State selection” default selected value is correct
// Expected: “Select a State”
        WebDriver driver;
        @BeforeMethod
        public void SetUp() {
            driver = WebDriverFactory.getDriver("chrome");
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.get("http://practice.cybertekschool.com/dropdown");
        }
        @AfterMethod
        public void SetUpClose() throws InterruptedException {
            Thread.sleep(2000);
            driver.quit();
        }
        @Test(priority = 1)
        public void SimpleDropdown(){
            //Verify “Simple dropdown” default selected value is correct
            Select simpleDrop = new Select(driver.findElement(By.xpath("//select[@id='dropdown']")));
            String actual = simpleDrop.getFirstSelectedOption().getText();
            String expected = "Please select an option";
            Assert.assertTrue(actual.equals(expected));
        }
        @Test(priority = 2)
        public void StateSelection(){
            //Verify “Simple dropdown” default selected value is correct
            Select simpleDrop = new Select(driver.findElement(By.xpath("//select[@id='state']")));
            String actual = simpleDrop.getFirstSelectedOption().getText();
            String expected = "Select a State";
            Assert.assertTrue(actual.equals(expected));
        }
        //TC #2: Selecting state from State dropdown and verifying result
// 1.Open Chrome browser
// 2.Go to http://practice.cybertekschool.com/dropdown
// 3.Select Illinois
// 4.Select Virginia
// 5.Select California
// 6.Verify final selected option is California. Use all Select options.(visible text, value, index)
        @Test(priority = 3)
        public void SelectState(){
            Select selectState = new Select(driver.findElement(By.xpath("//select[@id='state']")));
            //selectState.selectByValue("VA");
            driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
            selectState.selectByVisibleText("Illinois");
            driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
            selectState.selectByVisibleText("Virginia");
            driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
            selectState.selectByVisibleText("California");
            String expected = "California";
            String actual = selectState.getFirstSelectedOption().getText();
            Assert.assertTrue(actual.equals(expected));
        }
        //TC #3: Selecting date on dropdown and verifying
// 1.Open Chrome browser
// 2.Go to http://practice.cybertekschool.com/dropdown
// 3.Select “December 1st, 1921” and verify it is selected.Select year using: visible textSelect month using : value attributeSelect day using: index number
        @Test(priority = 4)
        public void December_1_1921(){
            Select selectYear = new Select(driver.findElement(By.xpath("//select[@id='year']")));
            driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
            selectYear.selectByVisibleText("1921");
            String expectedYear = "1921";

            String actualYear = selectYear.getFirstSelectedOption().getText();
            Assert.assertTrue(actualYear.equals(expectedYear));

            Select selectMonth = new Select(driver.findElement(By.xpath("//select[@id='month']")));
            driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
            selectMonth.selectByVisibleText("December");
            String expectedMonth = "December";
            String actualMonth = selectMonth.getFirstSelectedOption().getText();
            Assert.assertTrue(actualMonth.equals(expectedMonth));

            Select selectDate = new Select(driver.findElement(By.xpath("//select[@id='day']")));
            driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
            selectDate.selectByVisibleText("1");
            String expected3 = "1";
            String actual3 = selectDate.getFirstSelectedOption().getText();
            Assert.assertTrue(actual3.equals(expected3));
        }
        //TC #4: Selecting value from multiple select dropdown
// 1.Open Chrome browser
// 2.Go to http://practice.cybertekschool.com/dropdown
// 3.Select all the options from multiple select dropdown.
// 4.Print out all selected values.
// 5.Deselect all values.
        @Test(priority = 5)
        public void Select_Deselect() throws Exception {
            Select selectMultiple = new Select(driver.findElement(By.xpath("//select[@name='Languages']")));
//            Thread.sleep(2000);
//            List<WebElement> list=selectMultiple.getOptions();
//            for (WebElement eachElement:list){
//                selectMultiple.selectByVisibleText(eachElement.getText());
//            }

            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            for (int i = 0; i <= 5; i++) {
                selectMultiple.selectByIndex(i);
            }
            for (WebElement each : selectMultiple.getAllSelectedOptions()) { //selectMultiple.getAllSelectedOptions() - it's like an list
                System.out.println(each.getText());
            }
            selectMultiple.deselectAll();
        }
        //TC #5: Selecting value from non-select dropdown
// 1.Open Chrome browser
// 2.Go to http://practice.cybertekschool.com/dropdown
// 3.Click to non-select dropdown
// 4.Select Facebook from dropdown
// 5.Verify title is "Facebook -Log In or Sign Up"
        @Test(priority = 6)
        public void non_Select_Dropdown(){
            WebElement NOTdropdown = driver.findElement(By.xpath("//a[@class='btn btn-secondary dropdown-toggle']"));
            driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
            NOTdropdown.click();
            WebElement facebook = driver.findElement(By.xpath("// a[@class ='dropdown-item'][4]"));
            facebook.click();
            String actual = driver.getTitle();
            System.out.println(actual);
            String expected = "Facebook - Log In or Sign Up";
            Assert.assertEquals(actual, expected);
        }

    }
