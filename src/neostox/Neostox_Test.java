package neostox;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Neostox_Test {

	public static void main(String[] args)
	{
		
	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("https://www.neostox.com/sign-in");
	
	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
	
	
	 driver.findElement(By.xpath("(//input[@class='form-control'])[1]")).sendKeys("8275191198");
	
	
	
	
	
	
	
	
	}

}
