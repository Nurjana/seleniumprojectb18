package test.day10_jsexecutor_upload_actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.Driver;

public class ActionsPractice {

    @Test
    public void dragAndDrop() throws Exception{
        Driver.getDriver().get("https://demos.telerik.com/kendo-ui/dragdrop/index");
        Driver.getDriver().manage().window().maximize();

        WebElement draggable =Driver.getDriver().findElement(By.xpath("//div[@id='draggable']"));
        WebElement targetPoint=Driver.getDriver().findElement(By.id("droptarget"));
        Actions actions=new Actions(Driver.getDriver());

        actions.dragAndDrop(draggable,targetPoint).perform();

        Assert.assertEquals(targetPoint.getText(),"You did great!");

    }

    @Test
    public void hoverTest(){
        Driver.getDriver().get("");
    }

}
