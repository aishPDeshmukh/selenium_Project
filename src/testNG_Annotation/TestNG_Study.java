package testNG_Annotation;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNG_Study
{
   @BeforeClass
  public void LaunchURL()
{
	   Reporter.log("Open the browser and Launch Url", true);
}
 @BeforeMethod
   public void enterEmail()
 {
	  Reporter.log("Email", true);
  }
@BeforeMethod
public void enterPassword()
 {
	 Reporter.log("Password", true);
 }
 @Test
 public void EaditProfile()
{
	 Reporter.log("New Profile", true);
}
@Test
public void entername()
{
	 Reporter.log("Aishwarya Deshmukh", true);
}
@AfterMethod
public void Signout()
{
	 Reporter.log("SignOut From Account", true);
}
@AfterClass
public void closeBrowser()
{
	 Reporter.log("Close the Browser", true);
}
}
	


























