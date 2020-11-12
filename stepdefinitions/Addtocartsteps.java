package stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import enviroment.Enviroment;
import methods.Menu;
import methods.addtocartmethods;
import methods.loginmethods;
import objects.Addtocart;
import objects.Loginpage;


public class Addtocartsteps extends Enviroment {
	
   
WebDriver driver = browsersetup();  {
		
	}
	
	
	
	@Given("^User is login with valid credentials$")
	public void user_is_login_with_valid_credentials()throws Throwable {
	   
	    driver.get(Url);
	    loginmethods lg =new loginmethods(driver);
	    lg.signin();
	    lg.email();
	    lg.password();
	    lg.Submit1();
	    
	    
	}

	@When("^User navigate and click on Woman main menu$")
	public void user_navigate_and_click_on_Woman_main_menu() throws Throwable {
	    
		
		Menu Actions =new Menu(driver);
		Actions.Woman1();
		
	    addtocartmethods ad = new addtocartmethods(driver);
	    ad.Woman();
	    
	}

	@When("^User click on prodcut$")
	public void user_click_on_prodcut() throws Throwable {
		addtocartmethods ad = new addtocartmethods(driver);
		ad.Product();
		
	}

	@When("^User click on the add to cart button$")
	public void user_click_on_the_add_to_cart_button() throws Throwable {
		addtocartmethods ad = new addtocartmethods(driver);
		ad.Addtocart();
		
	}

	@Then("^User should see product into the cart$")
	public void user_should_see_product_into_the_cart() throws Throwable {
	        
	}
	
}


