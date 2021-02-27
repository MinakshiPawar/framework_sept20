package POM;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.BeforeClass;

public class Utility {
	private static final String TCID = null;
	static org.apache.poi.ss.usermodel.Sheet sh;

	
	public static String getTestData(int rowIndx, int colIndx) throws EncryptedDocumentException, IOException {
		//To import data from excel
				FileInputStream file=new FileInputStream("C:\\Users\\Lenovo\\Selenium\\Excel\\Sept20.xlsx");
				  sh = WorkbookFactory.create(file).getSheet("DDF");
	String value= sh.getRow(rowIndx).getCell(colIndx).getStringCellValue();
	return value; 
	
	
}


	public static void captureScreenshot(WebDriver driver, int tCID) throws IOException {
File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);     //To take a screenshot
		
		File dest=new File("C:\\Users\\Lenovo\\Selenium\\Screenshot\\TCNO_"+TCID+".jpg");     //Provide dest address
		
		FileHandler.copy(source, dest);
		
	}
}