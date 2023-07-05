package selenium_Study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Validate_GetText_Method {

	public static void main(String[] args) throws InterruptedException 
	{
		

	
	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("https://www.amazon.in/");
	
	Thread.sleep(1000);
	
    String actualText = driver.findElement(By.xpath("//h2[text()='Today’s Deals']")).getText();
	
     System.out.println(actualText);

   //expected text -----> from requirement document

	String expText = "Today’s Deals";
	
	if (expText.equals(actualText))
	{
	
	System.out.println("Actual and Expected text are Matching and TC is Passed");
	
	}
	
	else 
	
	{
		
		System.out.println("Actual and Expected text are not Matching and TC is faild");
	}
	
	
	
	

	}

}
