package utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class VyTrackUtilities {

    public static void VyTrackLogInPage() {
        Driver.getDriver().get(ConfigurationReader.getProperty("vytrack_url"));

        WebElement username = Driver.getDriver().findElement(By.xpath("//input[@name='_username']"));
        username.sendKeys(ConfigurationReader.getProperty("truckdriver_username"));

        WebElement password = Driver.getDriver().findElement(By.xpath("//input[@name='_password']"));
        password.sendKeys(ConfigurationReader.getProperty("truckdriver_password"));

        WebElement logInButton = Driver.getDriver().findElement(By.xpath("//button[@name='_submit']"));
        Driver.getDriver().manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        logInButton.click();
    }
    public static WebElement givenList_shouldReturnARandomElement(List<WebElement> types) {
        Random rand = new Random();
        WebElement random = types.get(rand.nextInt(types.size()));
        return random;
    }


    }

