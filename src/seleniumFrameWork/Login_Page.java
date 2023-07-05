package seleniumFrameWork;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page 
{
   //variable
	
	@FindBy(xpath = "//a[text()='Sign in']")private WebElement signInButtonHomePage;
	
	@FindBy(xpath = "(//input[@type='number'])[2]")private WebElement MobileNumberFeild;

    @FindBy(xpath = "(//span[text()='Sign in with Password'])[2]") private WebElement signInWithPassWord;

    @FindBy(name="password") private WebElement passWordFeild;

    @FindBy(xpath = "//a[@class='cl-btn sr-btn-primary']") private WebElement signInButton;

    @FindBy(xpath = "//div[text()='My Account']")private WebElement myAccountButton;

   @FindBy(xpath="//span[text()=' My profile ']") private WebElement myProfile;

  //constructor


  public Login_Page (WebDriver driver)

  {
	  PageFactory.initElements(driver, this);
  }

//method

  public void clickOnHomePageSignInButton()
  {
	  signInButtonHomePage.click();
  }

public void enterMobileNumberFeild()

{
	 MobileNumberFeild.sendKeys("8275191198");
}

   public void clickOnsignInWithPassWord()

   {
	   signInWithPassWord.click();
   }

   public void enterpassWordFeild()
   {
	   passWordFeild.sendKeys("230122");
   }


  public void clickOnsignInButton()

  {
	  signInButton.click(); 
  }


  public void clickOnmyAccountButton()

  {
	  myAccountButton.click();
  }

   public void clickOnmyProfile()
  
   {
	   myProfile.click();
   }










}


