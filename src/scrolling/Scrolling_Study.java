package scrolling;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Scrolling_Study {

	public static void main(String[] args) throws InterruptedException 
	{

	ChromeOptions opt = new ChromeOptions();
	
	opt.addArguments("disable-notification");
	
	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("https://www.justdial.com/");
	
	Thread.sleep(1000);
	
	JavascriptExecutor js = (JavascriptExecutor)driver;
	
	js.executeScript("window.scrollBy(700,600)");
	
	Thread.sleep(1000);
	
	js.executeScript("window.scrollBy(3,500)");
	
	Thread.sleep(1000);
	
	js.executeScript("window.ScrollBy(500,5)");
	
	Thread.sleep(1000);
	
	//js.executeScript("window.ScrollBy(10,600)");
	
	//Thread.sleep(1000);
	
	
	
	
	
	
	
	
	
	
	
	}

}
