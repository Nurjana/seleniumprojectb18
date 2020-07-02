package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class Driver {
    //1 -make constructor private to achieve singleton method
    private Driver(){
    }

    private static WebDriver driver;//Private constructor : ensures that noone else can create an instance of the WebDriver

    public static WebDriver getDriver(){// getter that has to return WebDriver driver
        if (driver==null){
            String browser= ConfigurationReader.getProperty("browser");
            switch (browser){
                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    driver=new ChromeDriver();
                    break;
                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driver=new FirefoxDriver();
                    break;
                case "chrome-headless":
                    WebDriverManager.chromedriver().setup();
                    driver=new ChromeDriver(new ChromeOptions().setHeadless(true));//headless browsers don't open visually
                    break;
                case "firefox-headless":
                    WebDriverManager.firefoxdriver().setup();
                    driver=new FirefoxDriver(new FirefoxOptions().setHeadless(true));
                    break;
            }
        }
                return driver;
    }

    public static void closeDriver(){
        if (driver!=null){
            driver.quit();
            driver=null;
        }
    }
}
