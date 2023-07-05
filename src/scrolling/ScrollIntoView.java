package scrolling;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ScrollIntoView {

	public static void main(String[] args) throws InterruptedException 
	{
		
	  ChromeOptions opt = new ChromeOptions();
	
	  opt.addArguments("disable-notification");
	
	  WebDriver driver = new ChromeDriver();
	
	  driver. manage().window().maximize();
	
	  driver.get("https://www.justdial.com/");
	
	  Thread.sleep(3000);
	
	    
		WebElement popularCategories = driver.findElement(By.xpath("//h2[text()='Popular Categories']"));
	
	 JavascriptExecutor Js = (JavascriptExecutor)driver;
	
	  Js.executeScript("agruments[0].scrollIntoView(true)",popularCategories);
	
	 
	
	
	
	
	
	
	
	
	
	
	}

}
