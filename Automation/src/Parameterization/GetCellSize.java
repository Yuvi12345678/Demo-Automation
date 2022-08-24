package Parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class GetCellSize {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream file = new FileInputStream("C:\\Users\\Pooja\\Downloads\\Excel Sheet\\New XLS Worksheet.xls");
		short cellSize = WorkbookFactory.create(file).getSheet("Sheet1").getRow(3).getLastCellNum();
		System.out.println(cellSize);//3
	}

}
