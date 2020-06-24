package test.day2_Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZeroBank {
    public static void main(String[] args) {

        //TC #4: Zero Bank URL verification
        //1. Open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        //2. Go to http://zero.webappsecurity.com/login.html


        //3. Get attribute value of href from the “forgot your password” link

        //WebElement forgotPasswordLink = driver.findElement(By.partialLinkText("Forgot"));
        //WebElement forgotPasswordLink = driver.findElement(By.partialLinkText("your"));
        //WebElement forgotPasswordLink = driver.findElement(By.partialLinkText("password"));
        //WebElement forgotPasswordLink = driver.findElement(By.partialLinkText("?"));
        //4. Verify attribute value contains
        //Expected: “/forgot-password.html”
        driver.get("http://zero.webappsecurity.com/login.html");
        WebElement forgotPasswordLink =driver.findElement(By.linkText("Forgot your password ?"));
        String actualHrefValue = forgotPasswordLink.getAttribute("href");// this will show you href element of the web page
        String expectedInHrefValue = "/forgot-password.html";//this is what you are looking for to get as a result
        System.out.println("actualHrefValue = " + actualHrefValue);


        if (actualHrefValue.contains(expectedInHrefValue)){
            System.out.println("Href value verification PASSED!");
        }else {
            System.out.println("Href value verification FAILED!");
        }

        System.out.println("Is forgot password displayed? " +forgotPasswordLink.isDisplayed());

    }
}
/*
TC #4: Zero Bank URLverification
1.Open Chrome browser
2.Go to http://zero.webappsecurity.com/login.html
3.Get attribute value of href from the “forgot your password”link
4.Verify attribute value containsExpected: “/forgot-password.html”

Hint: Locate the “Forgot your password ?” link, and use getAttribute value method to get the link behind the attribute within.
 */