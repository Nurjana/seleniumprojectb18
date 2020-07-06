package test.HomeWork;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TCwarmup_WindowHandle {
    @Test
    public void WindowHandle(){
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
        driver.get("https://www.amazon.com");
        ((JavascriptExecutor) driver).executeScript("window.open('http://google.com','_blank');");
        ((JavascriptExecutor) driver).executeScript("window.open('http://etsy.com','_blank');");
        ((JavascriptExecutor) driver).executeScript("window.open('http://facebook.com','_blank');");


    }
}

/*
TC-WarmUp# : Window Handlepractice
1.Create a new class called: WindowHandleWarmup
2.Create new test and make set ups
3.Go to : https://www.amazon.com
4.Copy paste the lines from below into your class
5.Create a logic to switch to the tab where Etsy.com is open
6.Assert: Title contains “Etsy”
Lines to be pasted:((JavascriptExecutor) driver).executeScript("window.open('http://google.com','_blank');");
((JavascriptExecutor) driver).executeScript("window.open('http://etsy.com','_blank');");
((JavascriptExecutor) driver).executeScript("window.open('http://facebook.com','_blank');");
These lines will simple open new tabs using something called JavaScriptExecutand get those pages. We will learn JavaScriptExecutor later as well.
 */