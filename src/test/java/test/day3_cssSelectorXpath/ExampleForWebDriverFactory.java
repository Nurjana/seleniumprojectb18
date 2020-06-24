package test.day3_cssSelectorXpath;

import org.openqa.selenium.WebDriver;
import utilities.WebDriverFactory;

public class ExampleForWebDriverFactory {
    public static void main(String[] args) {
//        WebDriverManager.chromedriver().setup();
//        WebDriver driver =new ChromeDriver();

        WebDriver driver =WebDriverFactory.getDriver("chrome");
    }
}
