package DDF;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class excelsheet {

	

	public static void main(String[] args) throws Throwable {
		
		FileInputStream fise=new FileInputStream("C:\\Users\\pavan\\eclipse-workspace\\world\\automationqe\\src\\main\\resources\\TESTNG.xlxx.xlsx");
		Workbook wb= WorkbookFactory.create(fise);
		String data=wb.getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
		System.out.println(data);
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
}
