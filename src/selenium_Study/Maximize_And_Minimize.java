package selenium_Study;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Maximize_And_Minimize {

	public static void main(String[] args) 
	{
		
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.facebook.com/");
	
	driver.manage().window().maximize();
	
	driver.manage().window().minimize();
	
	
	
	
	
	
	
	}

}
