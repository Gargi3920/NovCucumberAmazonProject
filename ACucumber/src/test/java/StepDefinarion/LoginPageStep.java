package StepDefinarion;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import Pages.HomeLogoutPage;
import Pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPageStep {
	WebDriver driver;
	LoginPage lp;
	HomeLogoutPage HP;
	@Given("user launch browser")
	public void user_launch_browser() {
		WebDriverManager.chromedriver().setup();
		ChromeOptions cp= new ChromeOptions();
		cp.addArguments("--remote-allow-origins=*");
		driver=new ChromeDriver(cp);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}

	@Given("User hit Amazon Page")
	public void user_hit_amazon_page() {
		driver.get("https://www.amazon.in/?&ext_vrnc=hi&tag=googhydrabk1-21&ref=pd_sl_7hmh5l8jr5_e&adgrpid=61764313147&hvpone=&hvptwo=&hvadid=610644605475&hvpos=&hvnetw=g&hvrand=725335014727045831&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=1007788&hvtargid=kwd-327061083&hydadcr=14455_2316418&gclid=CjwKCAiA0cyfBhBREiwAAtStHBtsYLsKSCgFik7PVY1PaYIN-rQCmtJeVgKsMkhnXxHN9iSCYLQH8RoCr3YQAvD_BwE");
		 lp=new LoginPage(driver);
		 lp.clickOnLoginButton();
	}

	@When("User Enter User Id {string} and click on continue button")
	public void user_enter_user_id_and_click_on_continue_button(String userId) {
		
		lp.SendUserIDandClickOnContinue(userId);
		
	    
	}

	@When("Uer Enter Password {string} and click on login button")
	public void uer_enter_password_and_click_on_login_button(String password) {
		lp.SendPasswordandClickOnLogin(password);
		
	    
	}

	@Then("user should be on home page of User")
	public void user_should_be_on_home_page_of_user() {
		System.out.println(driver.getCurrentUrl());
		HP= new HomeLogoutPage(driver);
	}
	@Then("Uer should logout successfully")
	public void uer_should_logout_successfully() {
	    HP.VerifyHomePage();
	    HP.logout();
	}



	


}
