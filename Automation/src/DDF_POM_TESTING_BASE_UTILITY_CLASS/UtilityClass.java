package DDF_POM_TESTING_BASE_UTILITY_CLASS;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class UtilityClass {
	
	public static String getPropertyFileData(String key) throws IOException {
		Properties obj = new Properties();
		FileInputStream objfile = new FileInputStream(System.getProperty("user.dir")+"\\URL.properties");
		obj.load(objfile);
		String value = obj.getProperty(key);
		return value;
	}
	public static String getTestData (int rowindex, int cellindex) throws EncryptedDocumentException, IOException {
		FileInputStream file = new FileInputStream("C:\\Users\\Pooja\\Downloads\\Excel Sheet\\sheet1.xls");
		org.apache.poi.ss.usermodel.Sheet sh = WorkbookFactory.create(file).getSheet("sheet1");
		String value = sh.getRow(rowindex).getCell(cellindex).getStringCellValue();
		return value;
	}
	public static void captureScreenshot(WebDriver driver, int TCID) throws IOException {
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\Pooja\\Downloads\\Excel Sheet"+TCID+".png");
		FileHandler.copy(src,dest);
	}

}
