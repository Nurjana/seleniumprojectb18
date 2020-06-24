package test.day1_selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {
    public static void main(String[] args) throws InterruptedException {
        //1-set up the web driver. This line creates connection between driver and selenium
        WebDriverManager.chromedriver().setup();

        //2-create the instance of the chrome driver
        WebDriver driver = new ChromeDriver();

        //this line will make the page big
        driver.manage().window().maximize();// or fullscreen

        //3 test if driver is working, we get google.com this time
        driver.get("https://www.google.com");
        //browser navigations
        //this line will take the user to the prev page
       // Thread.sleep(2000);// this line adds 2 seconds wait
        driver.navigate().back();

        //Thread.sleep(2000);
        driver.navigate().forward();//will go to the next page

        //Thread.sleep(3000);
        driver.navigate().refresh();// will refresh the page

        driver.navigate().to("https://www.facebook.com");

        System.out.println( "get title: "+driver.getTitle());// this will print out the title of the page

        System.out.println( "get URL: "+driver.getCurrentUrl());
       // System.out.println("get page source: "+driver.getPageSource()); this will print out
        // all the codes behind web page, not going to use it
        driver.close();



    }
}
