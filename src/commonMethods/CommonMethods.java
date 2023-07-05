package commonMethods;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.logging.FileHandler;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CommonMethods {

	//wait
	
	

	public static void implicitWait(WebDriver driver,long WaitTime)
		
	{
	  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(WaitTime));
	
	}
	
	
	//screenshot
	
	public static void captureScreenShot(WebDriver driver,String fileName)throws IOException
	
	{
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	

       File dest = new File("G:\\Sreenshots new\\Java Class\\18Feb Morning\\screenshot"+fileName+".png");

       org.openqa.selenium.io.FileHandler.copy(src,dest);
	
	}
	
	//scrolling
	
	public static void ScrollIntoView(WebDriver driver,WebElement element)

	{
		JavascriptExecutor js =(JavascriptExecutor)driver;
	
	   js.executeScript("arguments[0].scrollIntoView(true)", element);
	
	}

 //readDataFromExcel

  public static String readDataFromExcel(int rowNum,int cellNum)throws EncryptedDocumentException,IOException

  {
	  
  FileInputStream myFile = new FileInputStream("D:\\ExcelSheet.xlsx");
  
   String value = WorkbookFactory.create(myFile ).getSheet("Sheet1").getRow(rowNum).getCell(cellNum).getStringCellValue();
 
    return value;
  
  }











	
	
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	



	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	