package Parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class GetRowSize {
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream file = new FileInputStream("C:\\Users\\Pooja\\Downloads\\Excel Sheet\\New XLS Worksheet.xls");
		int rowsize = WorkbookFactory.create(file).getSheet("Sheet1").getLastRowNum();
		System.out.println(rowsize+1);//4
	}

	//getLastRowNum()-returns no of rows from other index
}
