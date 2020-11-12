package methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import objects.Addtocart;

public class addtocartmethods extends Addtocart{
	
	WebDriver driver;
	
    //constructor
	public addtocartmethods(WebDriver driver) 
	{
		this.driver= driver;
		
	}
	
	public void Woman()
	{
		driver.findElement(Woman).click();
	}
	
	public void Product() 
	{
		driver.findElement(Product).click();
		
	}
	
	public void Addtocart()
	{
		driver.findElement(Addtocart).click();
	}
	
	
	}
	


