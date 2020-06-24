package test.day2_Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getTextVsGetAttribute {
    public static void main(String[] args) {


        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com");

        System.out.println("Get text method: "+driver.findElement(By.linkText("Gmail")).getText());
        System.out.println("Get attribute value method: "+driver.findElement(By.linkText("Gmail")).getAttribute("href"));
}
  }