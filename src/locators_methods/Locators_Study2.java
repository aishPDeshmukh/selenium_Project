package locators_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators_Study2 {

	public static void main(String[] args)
	{
		
	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("https://www.facebook.com/login/");
	
	//Locators----->linkText
	
	//driver.findElement(By.linkText(" Forgotten acount?")).click();
	
	
	//Locators-----> partial link Text
	
	driver.findElement(By.partialLinkText("Forgotten")).click();
	
	
	
	
	
	
	
	}

}
