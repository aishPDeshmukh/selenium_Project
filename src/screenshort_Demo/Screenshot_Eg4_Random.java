package screenshort_Demo;

import java.io.File;
import java.io.IOException;
import java.util.Random;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class Screenshot_Eg4_Random {

	public static void main(String[] args) throws IOException 
	{
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.facebook.com/login/");
	
	driver.manage().window().maximize();
	
	File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	
	//System.out.println(source);
	
	  String Random = RandomString.make(3);
	
	 File dest = new File("C:\\Screenshot Eg 3\\Screenshot_eg2_random"+Random+".png");
	
	FileHandler.copy(source, dest);
	
	
	
	
	
	
	
	
	
	
	
	}

}
