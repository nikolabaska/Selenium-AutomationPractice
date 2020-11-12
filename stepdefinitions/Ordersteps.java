package stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import enviroment.Enviroment;
import junit.framework.Assert;
import methods.Menu;
import methods.OrderMethods;
import methods.addtocartmethods;
import methods.loginmethods;

public class Ordersteps  extends Enviroment{
WebDriver driver = browsersetup();  {
		
	}
	
	@Given("^User is login succesful with valid credentials$")
	public void user_is_login_succesful_with_valid_credentials() throws Throwable {
		
		driver.get(Url);
	    loginmethods lg =new loginmethods(driver);
	    lg.signin();
	    lg.email();
	    lg.password();
	    lg.Submit1();
	
	
	}

	@When("^User is add product into the cart$")
	public void user_is_add_product_into_the_cart() throws Throwable {
		Menu Actions =new Menu(driver);
		Actions.Woman1();
		Actions.Blouses();
		Actions.Product();
	   
       driver.switchTo().frame(0);
       
       OrderMethods or1 =new OrderMethods(driver);
       or1.Addtocart1();
       
	  Thread.sleep(2000);
	  driver.switchTo().defaultContent();
	}

	@Then("^User proceed to check out$")
	public void user_proceed_to_check_out() throws Throwable {
	 
	 
	 OrderMethods or =new OrderMethods(driver);
	 or.Procced();
	 or.Procceed1();
	    
	}

	@Then("^User verify his shipping address$")
	public void user_verify_his_shipping_address() throws Throwable {
		OrderMethods or =new OrderMethods(driver);
		or.Verify();
	}

	@Then("^User select Terms of service and Pay by check method$")
	public void user_select_Terms_of_service_and_Pay_by_check_method() throws Throwable {
		OrderMethods or =new OrderMethods(driver);
		or.Terms();
		or.Procced2();
		or.Payment();
	}

	@Then("^User succesful makes an order$")
	public void user_succesful_makes_an_order() throws Throwable {
		OrderMethods or =new OrderMethods(driver);
		or.Confirm();
		Thread.sleep(2000);
		driver.close();
	}


}
