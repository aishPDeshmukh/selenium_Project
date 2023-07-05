package selenium_Study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeys_Clear_Method {

	public static void main(String[] args) 
	{
		
	WebDriver driver = new ChromeDriver();
	
	//driver.get("https://www.flipkart.com/");
	
	driver.get("https://paytm.com/recharge");
	
	driver.manage().window().maximize();
	
	driver.findElement(By.xpath("(//input[@type='tel']")).sendKeys("8275191198");
	
	  //driver.findElement(By.xpath("//input[@type='tel']")).clear();
		
	 // driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("9423916389");
		
	//WebElement MO= driver.findElement(By.xpath("//input[@maxlength='10']"));
	
	 //  MO.clear();
	
	 
	
	
	
	
	
	}

}
