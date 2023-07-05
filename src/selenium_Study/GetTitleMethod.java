package selenium_Study;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitleMethod {

	public static void main(String[] args) 
	{
		
	 WebDriver driver = new ChromeDriver();
	
	 driver.get("https://paytm.com/");
	
	 driver.manage().window().maximize();
	
	 String myTitle = driver.getTitle();
	
	 System.out.println("Title of page is "+myTitle);
	
	
	
	
	
	
	
	}

}
