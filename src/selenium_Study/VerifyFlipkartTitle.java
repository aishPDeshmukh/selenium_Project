package selenium_Study;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyFlipkartTitle {

	public static void main(String[] args) 
	{
		
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.flipkart.com/");
	
	driver.manage().window().maximize();
	
	
	String expectedTitle= "Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!\r\n";
			
	String actualTitle= driver.getTitle();
	
	System.out.println("Actual Title is "+actualTitle);
	
	System.out.println("Expected Title is "+expectedTitle);
	
	
	if(expectedTitle.equals(actualTitle))
	
	
	{
		
	System.out.println("Expected and Actual Title are matching and TC is Passed");
	
	}
	
	
	else
		
	{
		System.out.println("Expected and Actual Title are not matching and TC is Failed ");
		
	}
	
	
	
	}

}
