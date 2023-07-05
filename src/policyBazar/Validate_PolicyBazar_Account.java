package policyBazar;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import commonMethods.CommonMethods;

public class Validate_PolicyBazar_Account {

	public static void main(String[] args) throws InterruptedException 
	{
		//using chrome options for disabling notification
   
		ChromeOptions opt = new ChromeOptions();
		
		opt.addArguments("disable-Notification");
		
		
		WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();

	driver.get("https://www.policybazaar.com/");
	
	CommonMethods.implicitWait(driver, 1000);
	
	driver.findElement(By.xpath("//a[text()='Sign in']")).click();
	
	CommonMethods.implicitWait(driver, 1000);
	
	driver.findElement(By.xpath("(//input[@type='number'])[2]")).sendKeys("8275191198");
	
	//click on sine in with password
	
	driver.findElement(By.xpath("(//span[text()='Sign in with Password'])[2]")).click();
	
	Thread.sleep(1000);
	//enter password
	
	driver.findElement(By.xpath("//input[@type='password']")).sendKeys("230122");
	
	//click on sine in button
	
	driver.findElement(By.xpath("//span[text()='Sign in']")).click();
	
	CommonMethods.implicitWait(driver, 1000);
	
	//now we are on home page
	
	// move on my account
	
	Thread.sleep(1000);
	
	driver.findElement(By.xpath("//div[text()='My Account']")).click();
	
	Thread.sleep(1000);
	
	driver.findElement(By.xpath("//span[text()=' My profile ']")).click();
	
	//new window will be opened,we need switch to focus to new window
	
	 Set<String> allId = driver.getWindowHandles();
	  
	 //convert set to list
	
	      List<String> Id = new ArrayList<>(allId);
	
	      String mainPageID = Id.get(0);  //main page Id
	
	   String childpageID = Id.get(1);  // chiled page Id
	
	 //switch to chiled page id
	
	driver.switchTo().window(childpageID);
	
	Thread.sleep(1000);
	
	String expectedResult = "Deshmukh Aishwarya Pravinsingh";
	
	String actualResult = driver.findElement(By.xpath("(//input[@class='MuiInputBase-input MuiOutlinedInput-input'])[1]")).getText();
	
	
	if (expectedResult.equals(actualResult)) 
	{
		System.out.println("Actual and expected results are matching TC is passed ");
	
	}
	
	else
	
	{
		System.out.println("Actual and expected results are not matching TC is Failed");
	}
	
	
	
	
	}

}
