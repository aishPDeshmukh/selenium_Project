package selenium_Study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Is_Selected_Method {

	public static void main(String[] args) throws InterruptedException 
	{
		
       WebDriver driver = new ChromeDriver();

	  driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	
	 driver.manage().window().maximize();
	
	Thread.sleep(1000);
	
	WebElement radioButton = driver.findElement(By.xpath("//input[@value='radio2']"));

	
//	System.out.println(radioButton.isSelected());
	
	//radioButton.click();
	
	
	if (radioButton.isSelected())
	{
		
	System.out.println("Radio Button is already Selected");
	
	}
	
	
	else
	{
		System.out.println("Selecting radio button");
	
	   radioButton.click();
	
	}
	
	
	
	
	
	
	
	
	
	
	
	}

}
