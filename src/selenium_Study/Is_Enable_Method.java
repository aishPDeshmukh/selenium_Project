package selenium_Study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Is_Enable_Method {

	public static void main(String[] args) throws InterruptedException 
	{
		
	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("https://auth.discoveryplus.in/login");
	
	Thread.sleep(1000);
	
	WebElement getOTPButton = driver.findElement(By.xpath("//button[text()='Get OTP']"));
	
	boolean result = getOTPButton.isEnabled();
	
  System.out.println("Get OTP Button Status is "+result );

		
  getOTPButton.click();


		driver.get("https://demoqa.com/radio-button");
	
	 Thread.sleep(1000);
	
	  WebElement radioButton = driver.findElement(By.xpath("//input[@id='yesRadio']"));
	
	 System.out.println(radioButton.isEnabled());
	
	
	if (radioButton.isEnabled()) 
	{
		System.out.println("Radio Button is Enabled ");
	
	}
	
	else
	{
		
	System.out.println("Radio Button is not Enabled");
	}
	
	
	radioButton.click();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
