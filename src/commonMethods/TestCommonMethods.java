package commonMethods;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCommonMethods {


  public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		
     WebDriver driver = new ChromeDriver();
	
	 driver.get("https://paytm.com/");
	
	CommonMethods.implicitWait(driver,1000);
	
	WebElement cashBackSection = driver.findElement(By.xpath("//h1[text()='Unlimited Cashback']"));
	
	CommonMethods.ScrollIntoView(driver,cashBackSection);
	
	CommonMethods.captureScreenShot(driver,"G:\\\\Sreenshots new\\\\Java Class\\\\18Feb Morning\\\\screenshot");
	
	     String myValue = CommonMethods.readDataFromExcel(0, 1);
	     CommonMethods.implicitWait(driver,1000);
	
	System.out.println(myValue);
	
	System.out.println(CommonMethods.readDataFromExcel(1, 0));
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
