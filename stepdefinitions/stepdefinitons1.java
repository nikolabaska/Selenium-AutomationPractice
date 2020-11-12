package stepdefinitions;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;
import enviroment.Enviroment;
import junit.framework.Assert;
import methods.loginmethods;
import objects.Addtocart;
import objects.Loginpage;

@RunWith(Cucumber.class)
public class stepdefinitons1 extends Enviroment{
	
	WebDriver driver = browsersetup();  {
		
	}
	
	@Given("^User is on automationpratice login page$")
	public void user_is_on_automationpratice_login_page()throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		String url = Url;
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
	}

	@When("^User is clicking on login page$")
	public void user_is_clicking_on_login_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   loginmethods lg=new loginmethods(driver);
	   lg.signin();
		   
	}

	@When("^User is puting valid email and password$")
	public void user_is_puting_valid_email_and_password() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
		loginmethods lg=new loginmethods(driver);
		   lg.signin();
		   lg.email();
		   lg.password();
		   lg.Submit1();
	}

	@Then("^User should be loged in$")
	public void user_should_be_loged_in() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
		Thread.sleep(3000);
		
		 driver.quit();
	}
	
}