package test.HomeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.Driver;

public class TC15_hoverOver {

@Test
    public void HoverTest (){

    Driver.getDriver().get("http://practice.cybertekschool.com/hovers");
    WebElement img1 = Driver.getDriver().findElement(By.xpath("//div[@class='figure'][1]"));
    WebElement user1 = Driver.getDriver().findElement(By.xpath("//h5[.='name: user1']"));

    Actions actions=new Actions(Driver.getDriver());
    actions.moveToElement(img1).perform();
    Assert.assertTrue(user1.isDisplayed());

    WebElement img2 = Driver.getDriver().findElement(By.xpath("//div[@class='figure'][2]"));
    WebElement user2=Driver.getDriver().findElement(By.xpath("//h5[.='name: user2']"));
    actions.moveToElement(img2).perform();
    Assert.assertTrue((user2).isDisplayed());

    WebElement img3 = Driver.getDriver().findElement(By.xpath("//div[@class='figure'][3]"));
    WebElement user3=Driver.getDriver().findElement(By.xpath("//h5[.='name: user3']"));
    actions.moveToElement(img3).perform();
    Assert.assertTrue((user3).isDisplayed());

    Driver.closeDriver();

}

}
/*
TC	#15:	Hover	Test
1. Go	to	http://practice.cybertekschool.com/hovers
2. Hover	over	to	first	image
3. Assert:
a. “name:	user1”	is	displayed
4. Hover	over	to	second	image
5. Assert:
a. “name:	user2”	is	displayed
6. Hover	over	to	third	image
7. Confirm:
a. “name:	user3”	is	displayed
 */