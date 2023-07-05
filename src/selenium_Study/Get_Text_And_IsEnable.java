package selenium_Study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_Text_And_IsEnable {

	public static void main(String[] args) throws InterruptedException
	{
		

	WebDriver driver= new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("https://www.facebook.com/login/");
	
	Thread.sleep(1000);
	
	 WebElement myElement = driver.findElement(By.xpath("//div[text()='Log in to Facebook']"));
	
	  // String myText = driver.findElement(By.xpath("//div[text()='Log in to Facebook']")).getText();
	
	System.out.println("The Text is "+myElement.getText());
	
	
	
	}

}
