package unOrderListStudy;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UnOrderListHandle {

	public static void main(String[] args) throws InterruptedException 
	{
		
	
	 WebDriver driver = new ChromeDriver();
	
	 driver. manage().window().maximize();
	
	  driver.get("https://www.google.com");
	
	 driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	
	 driver.findElement(By.name("q")).sendKeys("LED TV");
	Thread.sleep(1000);
	
	List<WebElement> searchResults = driver.findElements(By.xpath("(//ul[@class='G43f7e'])[1]//li)"));
	  
	driver.findElement(By.xpath("//a[text()='Sign in']")).click();
	
	for(WebElement sr:searchResults)
	
	{
		System.out.println(sr.getText());
	
	  String led = "led tv stand";
  
	 
	 if(led.equals(sr.getText()))
	
	 
	 {
		Thread.sleep(1000) ;
		 sr.click();
	
	    break;
	 }
	
	// https://demo.guru99.com/test/social-icon.html
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	
	
	}


