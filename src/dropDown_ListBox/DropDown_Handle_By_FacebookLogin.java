package dropDown_ListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown_Handle_By_FacebookLogin {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();

	   driver.manage().window().maximize();
	
	    driver.get("https://www.facebook.com/");
	
	  Thread.sleep(1000);
	
	 driver.findElement(By.xpath("//a[contains(@id,'u_0_0_')]")).click();
	
	Thread.sleep(2000);
	 
	 // next page will be open
	
	// 1. find xpath of list box
	
	WebElement Day = driver.findElement(By.id("day"));
	
	Select Sdate = new Select(Day);
	
	Sdate.selectByVisibleText("11");
	
	//Sdate.selectByIndex(4);
	
	//================================================
	
	//selecting month
	
	
	WebElement month = driver.findElement(By.id("month"));
	
	Select Smonth = new Select(month);
	
	//Smonth.selectByVisibleText("Mar");
	
	
	Smonth.selectByIndex(2);
	
	
	//selecting year
	
	WebElement Year = driver.findElement(By.name("birthday_year"));
	
	Select Syear = new Select(Year);
	
	Syear.selectByValue("2020");
	
	
	
	
	
	
	
	
	
	
	
	}

}
