package test.day3_cssSelectorXpath;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import utilities.WebDriverFactory;

public class CssSelectorExample {
    public static void main(String[] args) {

//1.Open browser
        WebDriver driver= WebDriverFactory.getDriver("chrome");
//2. Go to https://amazon.com
        driver.get("https://amazon.com");
//3. Enter any search term (use cssSelector to locate search box)
        driver.findElement(By.cssSelector("input[tabindex='19']")).sendKeys("wooden spoon"+ Keys.ENTER);
        String actualTitle=driver.getTitle();
        String expectedTitle="wooden spoon";
        if (actualTitle.contains(expectedTitle)){
            System.out.println("Title verification PASSED");
        }else {
            System.out.println("Title verification FAILED");
        }

//4. Verify title contains the search term
//


    }
}
