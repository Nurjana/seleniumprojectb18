package test.day1_selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_GoogleTitleVerification {
    public static void main(String[] args) {
        //TC	#1:	Google	Title	Verification1.Open	Chrome	browser2.
        // Go	to	https://www.google.com3.Verify	title:	Expected:	Go

       //Open	Chrome	browser2.
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        // Go	to	https://www.google.com3.
        driver.get("https://www.google.com");
        //Verify	title:	Expected:	Go
        System.out.println(driver.getTitle());
        String actualTitle=driver.getTitle();
        String expectedResult="google";

        if(actualTitle.equalsIgnoreCase(expectedResult)){
            System.out.println("Google title verification has passed");
        }else {
            System.out.println("Google title verification has failed");
        }
    }
}
