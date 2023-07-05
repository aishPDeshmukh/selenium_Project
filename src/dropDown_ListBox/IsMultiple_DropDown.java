package dropDown_ListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IsMultiple_DropDown {

	public static void main(String[] args) 
	{
		
	WebDriver driver = new ChromeDriver();
	
	driver. manage().window().maximize();
	
	driver.get("http://www.uitestpractice.com/Students/Select");
	
	WebElement country = driver.findElement(By.xpath("//select[@id=\"countriesMultiple\"]"));
	
	Select Scountry = new Select(country);
	
	System.out.println("Multiple Selectable Status is "+Scountry.isMultiple());
	
	//Scountry.selectByVisibleText("China");
	
	 // Scountry.selectByValue("england");
	
	 // Scountry.selectByIndex(2);
	
	Scountry.deselectByIndex(2);
	
	
	
	
	
	
	
	}

}
