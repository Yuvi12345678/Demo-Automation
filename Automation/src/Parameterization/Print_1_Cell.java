package Parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Print_1_Cell {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream file = new FileInputStream("C:\\Users\\Pooja\\Downloads\\Excel Sheet\\New XLS Worksheet.xls");
		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet2");
		
		for(int i=0; i<=sh.getLastRowNum(); i++) {
			String data = sh.getRow(i).getCell(0).getStringCellValue();
			System.out.println(data);
			
		}
	}

}
