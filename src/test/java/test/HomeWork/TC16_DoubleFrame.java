package test.HomeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.Driver;

public class TC16_DoubleFrame {
    @Test
    public void doubleClick() throws Exception{
        Driver.getDriver().get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick2");
        Driver.getDriver().switchTo().frame("iframeResult");
        WebElement demo= Driver.getDriver().findElement(By.xpath("//p[@id='demo']"));

        Actions actions= new Actions(Driver.getDriver());
        actions.moveToElement(demo).doubleClick().perform();

        Thread.sleep(2000);
        Assert.assertTrue(demo.getAttribute("style").contains("red"));

    }
}
/*
TC	#16:	Double	Click Test
1. Go	to	https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick2
2. Switch	to	iframe.
3. Double	click	on	the	text	“Double-click	me	to	change	my	text	color.”
4. Assert:	Text’s	“style”	attribute	value	contains	“red”.

 */