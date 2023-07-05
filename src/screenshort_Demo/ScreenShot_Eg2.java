package screenshort_Demo;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShot_Eg2 {

	public static void main(String[] args) throws IOException 
	{
		

	WebDriver driver = new ChromeDriver();
	
	driver.get("https://paytm.com/");
	
	driver.manage().window().maximize();
	
	File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	
	System.out.println(source);
	
	 File dest = new File("C:\\New folder (2)\\myScreenShotEg2.png");
	
	FileHandler.copy(source, dest);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
