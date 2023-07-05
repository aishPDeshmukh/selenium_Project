package webtable;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TooltipUse {

	public static void main(String[] args)
	{
		
	 WebDriver driver = new ChromeDriver();
	
	  driver .manage().window().maximize();
	
	  driver.get("https://demo.guru99.com/test/social-icon.html");
	
	  driver. manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
	
     WebElement mail = driver.findElement(By.xpath("(//a[@title='Mail'])[2]"));
	
	 String mailtip = mail.getAttribute("title");
	
	
	  System.out.println(mailtip);
	
	WebElement google = driver.findElement(By.xpath("(//a[@title='Google+'])[2]"));
	
	Object googleTip =google. getAttribute("title");
	
	System.out.println(googleTip);
	
	
	
	
	
	
	
	
	
	
	
	}
		
	}


