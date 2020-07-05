package test.US10_VyTrack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utilities.Driver;
import utilities.VyTrackUtilities;

import java.util.concurrent.TimeUnit;

public class TC10_124_VehicleFuelLog_Reset {


        @BeforeMethod
        public static void vyTrackLogInPage() throws Exception {
            VyTrackUtilities.VyTrackLogInPage();
            Thread.sleep(5000);
            // verifying the main page contains Quick Launchpad
            WebElement homePageName = Driver.getDriver().findElement(By.xpath("//h1[.='Quick Launchpad']"));
            Assert.assertTrue(homePageName.isDisplayed());

            //locating Fleet module
            Actions action = new Actions(Driver.getDriver());
            WebElement fleetSpan = Driver.getDriver().findElement(By.xpath("//span[contains(text(),'Fleet')]"));


            action.moveToElement(fleetSpan).perform();
            Driver.getDriver().findElement(By.linkText("Vehicles Fuel Logs")).click();
        }

@Test
        public void vehicleFuelLogs_verification() throws Exception{
            // to verify I am on the right page
            WebElement pageTitle=Driver.getDriver().findElement(By.linkText("Vehicle Fuel Logs"));
            Assert.assertTrue(pageTitle.isDisplayed());

        //GridButton ASSERTION
         WebElement griButton = Driver.getDriver().findElement(By.xpath("//div[@class='column-manager dropdown']"));
         Driver.getDriver().manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
         Assert.assertTrue(griButton.isDisplayed());
         griButton.click();


    //Click ALL options
    WebElement all = Driver.getDriver().findElement(By.xpath("//a[@data-role='column-manager-show-all']")); //a[@class='column-filter-renderable-tab active']
    //System.out.println(all.getAttribute("class"));
    //Allocate elements for selecting
    WebElement odometerValueOption = Driver.getDriver().findElement(By.xpath("//div[@class='table-wrapper']//tr[2]//td[3]"));
    WebElement literOption = Driver.getDriver().findElement(By.xpath("//div[@class='table-wrapper']//tr[3]//td[3]"));
    WebElement pricePerLiterOption = Driver.getDriver().findElement(By.xpath("//div[@class='table-wrapper']//tr[4]//td[3]"));
    //CHECK BOXES and RADIO BUTTONS;
    //    .isSelected() - returns true if checkbox is selected
    //    .isEnabled()  - returns true if checkbox is enabled(active).
    if (!all.getAttribute("class").contains("active")) {
        all.click();
        if (odometerValueOption.isSelected()) {
        } else {
            odometerValueOption.click();
        }
        if (literOption.isSelected()) {
        } else {
            literOption.click();
        }
        if (pricePerLiterOption.isSelected()) {
        } else {
            pricePerLiterOption.click();
        }
    }
    Driver.getDriver().findElement(By.xpath("//div[@class='dropdown-menu']//span[@class='close']")).click();


}


}
