package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class LoginPage {
    public LoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);
        // Page factory comes from selenium
        //this stands for -refer to the current object. we are connecting web driver with the object of this class
        // this method accepts two arguements: this stands for refering object of the login page,
       }

        @FindBy( id="prependedInput")// replaces findElement(By...), inside pranthesis there are locators
        public WebElement usernameInput;
        //locate input password and login button

        @FindBy(id="prependedInput2")
        public WebElement passwordInput;


    //locating login button
    @FindBy(id = "_submit")
    public WebElement loginButton;

    //locating error message
    @FindBy(xpath = "//div[@class='alert alert-error']")
    public WebElement errorMessage;

    //locating forgot your password link
    @FindBy(linkText = "Forgot your password?")
    public WebElement forgotPasswordLink;



    public void login(String username, String password){

        usernameInput.sendKeys(username);
        passwordInput.sendKeys(password);
        loginButton.click();

    }


}


