package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;
	
	@FindBy(xpath ="//div[@id='nav-signin-tooltip']//a//span")
	WebElement LoginButton;
	@FindBy(id="ap_email")
	WebElement userName;
	@FindBy(id="continue")
	WebElement continue1;
	
	@FindBy(id="ap_password")
	WebElement Pasword;
	@FindBy(id="signInSubmit")
	WebElement signInSubmit;
	
public LoginPage(WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(driver, this);
	
}
public void clickOnLoginButton() {
	LoginButton.click();
	
}
public void SendUserIDandClickOnContinue(String userId) {
	userName.sendKeys(userId);
	continue1.click();
}


public void SendPasswordandClickOnLogin(String password) {
	Pasword.sendKeys(password);
	signInSubmit.click();
	
}

}
