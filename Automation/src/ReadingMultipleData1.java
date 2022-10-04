package qsp;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadingMultipleData1  {
	
	public static  void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("./data/UserName.xlsx");
		Workbook wb=  WorkbookFactory.create(fis);
		int count = wb.getSheet("Sheet1").getLastRowNum();
		for(int i=0;i<count;i++) {//same only difference in taking valueof for loop
			String un = wb.getSheet("Sheet1").getRow(i).getCell(0).getStringCellValue();
			System.out.println(un);
		}
		
}
}
