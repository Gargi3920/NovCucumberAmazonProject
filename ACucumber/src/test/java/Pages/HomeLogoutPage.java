package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomeLogoutPage {
	WebDriver driver;
	@FindBy(id = "nav-link-accountList-nav-line-1")
	WebElement userAccountName;
	@FindBy(id = "nav-link-accountList")
	WebElement LogoutOption;
	@FindBy(xpath = "//span[normalize-space()='Sign Out']")
	WebElement logout;

	public HomeLogoutPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
		
	}
	public void VerifyHomePage() {
	
		System.out.println(userAccountName.getText());
		
	}
	public void logout() {
		Actions act =new Actions (driver);
		act.moveToElement(LogoutOption).build().perform();
		logout.click();
	}
	
	
}
