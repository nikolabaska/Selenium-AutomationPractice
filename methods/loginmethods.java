package methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import objects.Loginpage;

public class loginmethods extends Loginpage {

	WebDriver driver;
	
	//consturctor
	
	public  loginmethods(WebDriver driver)
	{
		
		this.driver= driver;
		
	}
	
	public void signin() {
		driver.findElement(signin).click();
	}
	public void email()
	{
		driver.findElement(email).sendKeys(usser);
	}
	public void password()
	{
		driver.findElement(password).sendKeys(pass);
	}
	public void Submit1()
	   {
		   
		  driver.findElement(Submit1).click();
	   }
	
}
