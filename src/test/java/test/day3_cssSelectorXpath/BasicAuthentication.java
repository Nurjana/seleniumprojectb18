package test.day3_cssSelectorXpath;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicAuthentication {
    public static void main(String[] args) {
//TC #5: Basic authentication Zero Bank
        // 1.Open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        // 2.Go to http://zero.webappsecurity.com/login.html
        driver.get("http://zero.webappsecurity.com/login.html");
        // 3.Enter username: username
        // 4.Enter password: password
        // 5.Click sign in button
        driver.findElement(By.id("user_login")).sendKeys("username");
        driver.findElement(By.id("user_password")).sendKeys("password");
        driver.findElement(By.name("submit")).click();
        // 6.Verify username is displayed on the page
        String useName = driver.findElement(By.id("settingsBox")).getText();
        System.out.println(useName);
        String linkAc = "account-summary";
        if(useName.contains("username")){
            System.out.println("User name: " + useName + " is displayed on the page");
        }else{
            System.out.println("User name: " + useName + " is NOT displayed on the page");
        }
        // 7.Verify the title Zero – Account Summary
        String title = driver.getTitle();
        if(title.equals("Zero - Account Summary")){
            System.out.println(title + " - is dispalayed on the page. You are on the right page");
        }else{
            System.out.println("You are on the wrong page");
        }
        // 8.Verify the link Account Summary's href value contains: "account-summary"
        String linkAccount = driver.getCurrentUrl();
//        if(linkAccount.contains("account-summary")){
//            System.out.println("Page contains "+ account-summary ");
//        }else{
//            System.out.println("You are on the wrong page");
//        }
        // Print out results in validation formats

}}
/*
TC #5: Basic authentication Zero Bank
1.Open Chrome browser
2.Go to http://zero.webappsecurity.com/login.html
3.Enter username: username
4.Enter password: password
5.Click sign in button
6.Verify username is displayed on the page
7.Verify the title Zero –Account Summary
8.Verify the link Account Summary’s href value contains: “account-summary”Print out results in validation formats
 */