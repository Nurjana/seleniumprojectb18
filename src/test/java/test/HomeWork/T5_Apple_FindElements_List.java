package test.HomeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.WebDriverFactory;

import java.util.List;

public class T5_Apple_FindElements_List {
    public static void main(String[] args) throws InterruptedException {
        //1. Open Chrome browser
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        //2. Go to https://www.apple.com
        driver.get("https://www.apple.com");
        //3. Click to all of the headers one by one

        //4. Print out how many links on each page with the titles of the pages
        int emptyLinkCounter = 0;
        int linksWithText = 0;

        Thread.sleep(5000);
        List<WebElement> allTabs=driver.findElements(By.xpath("//ul[@class='ac-gn-list']/li/a"));
        for (int i=1;i<8;i++){
            allTabs.get(i).click();
            Thread.sleep(5000);
            List<WebElement> listOfLinks = driver.findElements(By.xpath("//body//a"));
            //4. Print out how many links on each page with the titles of the pages
            System.out.println("Number of links on page: " + driver.getTitle() + " " + listOfLinks.size());
            //8. Print out how many total link TOTAL
            for (WebElement link : listOfLinks) {
                String textOfLink = link.getText();
                if (!textOfLink.isEmpty()) {
                    System.out.println(textOfLink);
                     linksWithText++;
                } else {
                    emptyLinkCounter++;
                }
            }
            driver.navigate().back();
            allTabs = driver.findElements(By.xpath("//ul[@class='ac-gn-list']/li/a"));
        }
        System.out.println("Number of EmptyLinks: \t" + emptyLinkCounter);
         System.out.println("Number of Links with text: \t" + linksWithText);
    }
}




    /*
    TC #03: FINDELEMENTS_APPLE
1. Open Chrome browser
2. Go to https://www.apple.com
3. Click to all of the headers one by one
a. Mac, iPad, iPhone, Watch, TV, Music, Support
4. Print out how many links on each page with the titles of the pages
5. Loop through all
6. Print out how many link is missing text TOTAL
7. Print out how many link has text TOTAL
8. Print out how many total link TOTAL
     */