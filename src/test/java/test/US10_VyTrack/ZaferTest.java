package test.US10_VyTrack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utilities.Driver;
import utilities.WebDriverFactory;

public class ZaferTest {

        WebDriver driver;
        @BeforeClass
        public void setUp_login() {
            driver = WebDriverFactory.getDriver("Chrome");
            driver.manage().window().maximize();
            driver.get("https://qa2.vytrack.com/user/login");

            WebElement username = driver.findElement(By.xpath("//input[@name='_username']"));
            username.sendKeys("storemanager69");
            WebElement password = driver.findElement(By.xpath("//input[@name='_password']"));
            password.sendKeys("UserUser123");
            WebElement login = driver.findElement(By.xpath("//button[@name='_submit']"));
            login.click();

        }
        @BeforeMethod
        public void login_page() throws InterruptedException {
            Actions actions = new Actions(driver);
            WebElement fleet = driver.findElement(By.xpath("(//span[@class='title title-level-1'])[2]"));
            actions.moveToElement(fleet).perform();
            Thread.sleep(3000);
            WebElement vehicleCosts = driver.findElement(By.xpath("(//div[@class='dropdown-menu-wrapper dropdown-menu-wrapper__placeholder'])[2]//ul//li[5]"));
            vehicleCosts.click();
            Thread.sleep(3000);
            // add assertions

        }

        @Test(priority = 0)
        public void VehicleCosts_create_delete() throws Exception {
            Actions actions = new Actions(driver);
            WebElement fleet = driver.findElement(By.xpath("(//span[@class='title title-level-1'])[2]"));
            actions.moveToElement(fleet).perform();
            Thread.sleep(3000);
            WebElement vehicleCosts = driver.findElement(By.xpath("(//div[@class='dropdown-menu-wrapper dropdown-menu-wrapper__placeholder'])[2]//ul//li[5]"));
            vehicleCosts.click();
            Thread.sleep(3000);
            WebElement createVehicleCosts = driver.findElement(By.xpath("//a[@title='Create Vehicle Costs']"));
            createVehicleCosts.click();
            Thread.sleep(3000);
            WebElement cancel = driver.findElement(By.xpath("//a[@title='Cancel']"));
            cancel.click();
            Thread.sleep(3000);
        }
        @Test (priority = 1)
        public void VehicleCost_addAttachement()throws Exception {
            WebElement createVehicleCosts2 = driver.findElement(By.xpath("//a[@title='Create Vehicle Costs']"));
            createVehicleCosts2.click();
            Thread.sleep(3000);
            WebElement saveAndClose = driver.findElement(By.xpath("//button[@type='submit']"));
            saveAndClose.click();
            Thread.sleep(3000);
            WebElement moreActions = driver.findElement(By.xpath("//a[@class='btn dropdown-toggle']"));
            moreActions.click();
            Thread.sleep(3000);
            WebElement addAttachment = driver.findElement(By.xpath("//a[@title='Add attachment']"));
            addAttachment.click();
            Thread.sleep(3000);
            WebElement chooseFile= Driver.getDriver().findElement(By.name("oro_attachment[file][file]"));
            Thread.sleep(3000);
            chooseFile.sendKeys("\"C:\\Users\\Nurjana\\Desktop\\Сочинение.docx\"");
            WebElement save1 = driver.findElement(By.xpath("//button[@type='submit']"));
            save1.click();
        }
}
