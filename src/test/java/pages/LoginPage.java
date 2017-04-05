package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Karthik on 10/25/2016.
 */
public class LoginPage {

    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
  
    @FindBy(how = How.XPATH, using = "//input[@id='hp-widget__sfrom']")
    public WebElement txtUserName;
  
    @FindBy(how = How.XPATH, using = "//input[@id='hp-widget__sTo']")
    public WebElement txtPassword;
 
    @FindBy(how = How.XPATH, using = "//button[contains(@id,'searchBtn')]")
    public WebElement btnLogin;

    public void Login(String userName, String password)
    {
        txtUserName.sendKeys(userName);
        txtPassword.sendKeys(password);
    }

    public void ClickLogin()
    {
        btnLogin.click();
    }


}
