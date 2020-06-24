package test.day2_Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestGoogleApple {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driverChrome= new ChromeDriver();
        driverChrome.manage().window().maximize();
        driverChrome.get("https://www.google.com");
        driverChrome.findElement(By.name("q")).sendKeys("apple"+ Keys.ENTER);
        String actualTitle= driverChrome.getTitle();
                String expectedTitle="apple";

                if (actualTitle.startsWith(expectedTitle)){
                    System.out.println("Google search title verification PASSED!");
                }else {
                    System.out.println("Google search title verification FAILED!");
                }
    }
}
/*
TC#4:	Google	search
1-Open	a	chrome	browser
2-Go	to:	https://google.com
3-Write	“apple”	in	search	box
4-Click	google	search	button
5-Verify	title: Expected:	Title	should	start	with	“apple”	word
 */