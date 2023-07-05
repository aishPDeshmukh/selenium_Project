package locators_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSS_Selector_Locator {

	public static void main(String[] args) 
	{
		
	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("https://www.facebook.com/login/");
	
	//CSS---> Using Tag and id--> Tag#id
	
	
	//driver.findElement(By.cssSelector("input#email")).sendKeys("Hello");
	
	//CSS---> using Tag and Class---->tag.class
	
//	driver.findElement(By.cssSelector("a._97w5")).click();
	
	//driver.findElement(By.cssSelector("button._42ft")).click();
	
	
	//css---> tag and Attribute--->tag[attribute=value]
	
	driver.findElement(By.cssSelector("input[type=password]")).sendKeys("Aishwarya");
	
	driver.findElement(By.cssSelector("input[type=password]")).clear();
	
	
	//css---> Tag ,class, and ,attribute--->tag.class[attribute=value]
	
	
	//driver.findElement(By.cssSelector("input.inputtext[id=\"pass\"]")).sendKeys("byyy");
	
	
	
	
	
	
	
	
	}

}
