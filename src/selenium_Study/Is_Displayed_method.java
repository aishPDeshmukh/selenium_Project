package selenium_Study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Is_Displayed_method {

	

	public static void main(String[] args) throws InterruptedException
	{
		
	
	 WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	
	 driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	
	Thread.sleep(1000);
	
	WebElement textBox = driver.findElement(By.xpath("//input[@id='displayed-text']"));
	
	System.out.println(textBox.isDisplayed());
	
	WebElement hiddenButton = driver.findElement(By.xpath("//input[@id='hide-textbox']"));
	
	System.out.println(hiddenButton.isDisplayed());
	
	WebElement showButton = driver.findElement(By.xpath("//input[@id='show-textbox']"));
	
	//textBox.sendKeys("Good Morning");
	
	//hiddenButton.click();
	
	//textBox.sendKeys("Good Evening");
	
	showButton.click();
	
	if (textBox.isDisplayed()) 
	{
		System.out.println("text box is displayed");
	  
	  textBox.sendKeys("Hii");
	}
	
	else
		
	{
		
		System.out.println("text box is not displayed");
	}
	
	
	
	
	}

}
