package test.day2_Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BackAndForthNavigation {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.com");
        driver.manage().window().maximize();

        driver.findElement(By.linkText("Gmail")).click();
        String actualGmailTitle=driver.getTitle();
        String expectedinTitle="Gmail";

        if (actualGmailTitle.contains(expectedinTitle)){
            System.out.println("Title VERIFIED");
        }else {
            System.out.println("Title verification FAILED");
        }

        driver.navigate().back();

        String actualTitle=driver.getTitle();
        String expectedTitle="Google";

        if (actualTitle.equalsIgnoreCase(expectedTitle)){
            System.out.println("Google page title verification Passed");
        }else {
            System.out.println("Google page title verification Failed");
        }

    }
}
/*
TC #3: Back and forth navigation
1-Open a chrome browser
2-Go to: https://google.com
3-Click to Gmail from top right.
4-Verify title contains:Expected: Gmail
5-Go back to Google by using the .back();
6-Verify title equals:Expected: Google
 */