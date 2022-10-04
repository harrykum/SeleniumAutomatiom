package qsp;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadingMultipleData_login_i_j  {
	
	public static  void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("./data/UserName.xlsx");
		Workbook wb=  WorkbookFactory.create(fis);
		//get last row no which contains data
		int rowcount = wb.getSheet("Sheet1").getLastRowNum();
		short cellcount = wb.getSheet("Sheet1").getRow(0).getLastCellNum();
		for(int i=1;i<=rowcount;i++) 
		{
			for(int j=0;j<cellcount;j++) {
				String data = wb.getSheet("Sheet1").getRow(i).getCell(j).getStringCellValue();
				System.out.println(data);
			}
				
		}
		
}
}

 
 


