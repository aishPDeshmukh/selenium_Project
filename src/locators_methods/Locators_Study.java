package locators_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators_Study {

	public static void main(String[] args)
	{
	
	WebDriver driver= new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("https://www.facebook.com/login/");
	
	//2.Locators--->Name
	
	  driver.findElement(By.name("email")).sendKeys("Good Morning");
	
	  driver.findElement(By.name("email")).sendKeys("Good Morning");
		
	  
	  //driver.findElement(By.name("pass")).sendKeys("230122");
	

     //3.Locators--->ID
	
	//driver.findElement(By.id("email")).sendKeys("Aishwarya");
	
	
	//4.Locators----->class
	
	driver.findElement(By.className("inputtext")).sendKeys("Hello");
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
