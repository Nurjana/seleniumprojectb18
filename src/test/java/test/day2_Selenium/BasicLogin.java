package test.day2_Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicLogin {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");
        driver.manage().window().maximize();
        String actualPageName=driver.getTitle();
        String expectedPageName="aspnetForm";

        if (actualPageName.equalsIgnoreCase(expectedPageName)){
            System.out.println("Verification passed");
        }else {
            System.out.println("Verification failed");
        }

        driver.findElement(By.name("ctl00$MainContent$username")).sendKeys("Tester");
        driver.findElement(By.linkText("ctl00_MainContent_password")).sendKeys("test");
        driver.findElement(By.name("ctl00$MainContent$login_button")).click();

        String actualWebPage=driver.getTitle();
        String expectedWebPage="Web Orders";
        if (expectedWebPage.equalsIgnoreCase(expectedWebPage)){
            System.out.println("Page verified");
        }else {
            System.out.println("Page not verified");
        }

    }

    }

/*
TC#5:	Basic	login	authentication
1-Open	a	chrome	browser
2-Go	to:	http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx
3-Verify	title	equals:Expected:	Web	Orders	Login
4-Enter	username:	Tester
5-Enter	password:	test
6-Click	“Sign	In”	button
7-Verify	titleequals: Expected:	Web	Orders
 */