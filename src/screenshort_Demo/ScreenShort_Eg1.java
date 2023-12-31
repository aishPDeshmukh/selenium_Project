package screenshort_Demo;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import commonMethods.CommonMethods;

public class ScreenShort_Eg1 {

	public static void main(String[] args) throws IOException 
	{
		
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://in.via.com/bus-tickets?");
	
	driver.manage().window().maximize();
	
	File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	
	driver.manage().window().maximize();
	
	System.out.println(source);
	
	File dest = new File("C:\\New folder\\myScreenShot.png");
	
	FileHandler.copy(source, dest);
	
	CommonMethods.captureScreenShot(driver, "ab");
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
