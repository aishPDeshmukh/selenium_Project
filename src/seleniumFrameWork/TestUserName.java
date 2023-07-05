package seleniumFrameWork;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestUserName {

	public static void main(String[] args) throws InterruptedException 
	{
		
  WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.policybazaar.com/");
	
	driver.manage().window().maximize();
	
	driver.manage(). timeouts().implicitlyWait(Duration.ofMillis(1000));
	
	//create object of login page
	
	
	Login_Page login = new Login_Page(driver);
	
	login.clickOnHomePageSignInButton();
	
	Thread.sleep(500);
	
	login.enterMobileNumberFeild();
	
	Thread.sleep(500);
	
	login.clickOnsignInWithPassWord();
	
	Thread.sleep(1000);
	
	login.enterpassWordFeild();
	
	Thread.sleep(500);
	
	login.clickOnsignInButton();
	
	Thread.sleep(500);
	
	login.clickOnmyAccountButton();
	
	Thread.sleep(2000);
	
	login.clickOnmyProfile();
	
	Thread.sleep(2000);
	
	
	
	//new tab wiil be opened , we need to switch to new tab
	
	Set<String> allID = driver.getWindowHandles();
	
	List<String> al = new ArrayList<>(allID);
	
	//switching focus to myAccount page
	
	driver.switchTo().window(al.get(1));
	
	//create object of myAccountPage class
	
	Thread.sleep(500);
	
	MyAccountPage myAcc = new MyAccountPage(driver);
	
	myAcc.validateUserName();
	
	driver.quit();
	
	
	
	
	
	
	
	
	
	
	
	}

	
	}


