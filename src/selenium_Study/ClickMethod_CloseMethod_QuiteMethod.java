package selenium_Study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickMethod_CloseMethod_QuiteMethod {

	public static void main(String[] args) 
	{
	
	
	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("https://www.facebook.com/");
	
	//driver.findElement(By.xpath("(//button[@type='submit'])[1]")).click();
	
	 WebElement loginButton = driver.findElement(By.xpath("(//button[@type='submit'])[1]"));
	
	
	//loginButton.click();
	
	driver.close();
	
	driver.quit();
	
	
	
	
	
	
	}

}
