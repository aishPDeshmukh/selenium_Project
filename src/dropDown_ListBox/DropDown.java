package dropDown_ListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) throws InterruptedException
	{
		

	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("https://demo.guru99.com/test/newtours/register.php");
	
	Thread.sleep(1000);
	
	WebElement city = driver.findElement(By.xpath("//select[@name='country']")); // find locator by xpath
	
	Select Scity = new Select(city); //create object of select class
	
	Scity.selectByVisibleText("AUSTRIA");
	
	//Scity.selectByValue("BOLIVIA");
	
	//Scity.deselectByValue("BOLIVIA");
	
	 // Scity.deselectByVisibleText("AUSTRIA");
	
	
	
	
	
	
	
	
	}

}
