import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

		
		File src = new File("C:\\Users\\soumya.penuguvvi\\Documents\\Preparation\\CoreJavaPrac\\Excel Data\\TestData.xlsx");
		
		FileInputStream fis = new FileInputStream(src);
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		 XSSFSheet sheet1 = wb.getSheet(0);
		 String data = sheet1.getRow(0).getCell(0).getStringCellValue();
		 System.out.println("Data from Excel: "+data);	


}
