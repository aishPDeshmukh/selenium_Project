package seleniumFrameWork;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAccountPage 
{

   //variable
	
	@FindBy(xpath ="(//input[@class='MuiInputBase-input MuiOutlinedInput-input'])[1]" )private WebElement userName;


  //constructor

  public MyAccountPage(WebDriver driver)

  {
	  PageFactory.initElements(driver, this);
  }


 //method

 public void validateUserName()

 {
	 String actualUN=userName.getText();
 
   String expUN="Deshmukh Aishwarya Pravinsingh";
 
 
 if(expUN.equals(actualUN))
 
 {
	 System.out.println("Actual and expected user names are matching TC is passed");
 }
   else
 
   {
	   System.out.println("Actual and expected user names are not matching TC is Failed");
   }
 
 
 
 
 }



























}
