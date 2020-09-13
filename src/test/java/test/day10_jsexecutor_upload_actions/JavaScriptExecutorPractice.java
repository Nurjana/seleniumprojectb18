package test.day10_jsexecutor_upload_actions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import utilities.Driver;

public class JavaScriptExecutorPractice {

    @Test
    public void jsexecutor_test() throws InterruptedException{
        Driver.getDriver().get("http://practice.cybertekschool.com/");
        WebElement cybertekSchoolLink = Driver.getDriver().findElement(By.linkText("Cybertek School"));
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor)Driver.getDriver();

        Thread.sleep(4000);
        javascriptExecutor.executeScript("arguments[0].scrollIntoView(true);", cybertekSchoolLink);
    }

    @Test
    public void scrollingTest() throws Exception{
        Driver.getDriver().get("http://practice.cybertekschool.com/");
        Driver.getDriver().manage().window().maximize();

        WebElement link=Driver.getDriver().findElement(By.linkText("Cybertek School"));
        JavascriptExecutor js=(JavascriptExecutor) Driver.getDriver();

        js.executeScript("arguments[0].scrollIntoView(true);"+"arguments[0].click()",link);
                        // arguments is the name of the collection element
        Driver.getDriver().close();
    }


}
