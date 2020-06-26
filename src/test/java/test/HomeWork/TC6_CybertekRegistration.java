package test.HomeWork;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import utilities.WebDriverFactory;

import java.util.concurrent.TimeUnit;

public class TC6_CybertekRegistration {
    WebDriver driver;
    // 1.Open browser
// 2.Go to website: http://practice.cybertekschool.com/registration_form
    @BeforeClass
    public void setUp() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://practice.cybertekschool.com/registration_form");
    }
    @Test(priority = 1)
    public void registration() {
        Faker faker = new Faker();
        WebElement firstName = driver.findElement(By.xpath("//input[@name='firstname']"));
        firstName.sendKeys(faker.name().firstName());
        WebElement lastName = driver.findElement(By.xpath("//input[@name='lastname']"));
        lastName.sendKeys(faker.name().lastName());
        WebElement userName = driver.findElement(By.xpath("//input[@name='username']"));
        userName.sendKeys(faker.name().username().replace(".",""));
        WebElement email = driver.findElement(By.xpath("//input[@name='email']"));
        email.sendKeys(faker.internet().emailAddress());
        WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
        password.sendKeys(faker.internet().password());
        WebElement phoneNumber = driver.findElement(By.xpath("//input[@name='phone']"));
        phoneNumber.sendKeys("555-555-5551");
        WebElement femaleGender = driver.findElement(By.xpath("//input[@value='female']"));
        femaleGender.click();
        WebElement DOB = driver.findElement(By.xpath("//input[@name='birthday']"));
        DOB.sendKeys("10/10/1980");
        Select department = new Select(driver.findElement(By.xpath("//select[@name='department']")));
        department.selectByVisibleText("MPDC");
        Select jobTitle = new Select(driver.findElement(By.xpath("//select[@name='job_title']")));
        jobTitle.selectByIndex(5); //QA
        WebElement language = driver.findElement(By.xpath("//input[@id='inlineCheckbox2']"));
        language.click();
        WebElement signUp = driver.findElement(By.xpath("//button[@id='wooden_spoon']"));
        signUp.click();
    }
    @Test(priority = 2)
    public void verification() {
        WebElement successMessage = driver.findElement(By.xpath("//div/p"));
        Assert.assertTrue(successMessage.isDisplayed());
    }}
// 3.Enter first name
// 4.Enter last name
// 5.Enter username
// 6.Enter email address
// 7.Enter password
// 8.Enter phone number
// 9.Select a gender from radio buttons
// 10.Enter date of birth
// 11.Select Department/Office
// 12.Select Job Title
// 13.Select programming language from checkboxes
// 14.Click to sign up button
// 15.Verify success message "You've successfully completed registration."is displayed