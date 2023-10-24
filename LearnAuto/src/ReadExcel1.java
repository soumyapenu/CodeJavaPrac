import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;

public class ReadExcel1 {

    public static void main(String[] args) throws Exception {

        File src = new File("C:\\Users\\soumya.penuguvvi\\Documents\\Preparation\\CoreJavaPrac\\Excel Data\\TestData.xlsx");

        FileInputStream fis = new FileInputStream(src);

        XSSFWorkbook wb = new XSSFWorkbook(fis);

        XSSFSheet sheet1 = wb.getSheetAt(0);

        int rowCount = sheet1.getLastRowNum();

        System.out.println("Total number rows: "+rowCount);

        for(int i=0; i<= rowCount; i++){

            String data = sheet1.getRow(i).getCell(0).getStringCellValue();

            System.out.println("Data from Excel sheet: " + data);

            String data1 = sheet1.getRow(i).getCell(1).getStringCellValue();

            System.out.println("Data from Excel sheet: " + data1);

        }



        wb.close(); 
    }
}

