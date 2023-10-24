package Lib;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;

public class ExcelDataConfig {

    XSSFWorkbook wb;
    XSSFSheet sheet1;

    public ExcelDataConfig(String excelPath){
        try {
            File src = new File(excelPath);
            FileInputStream fis = new FileInputStream(src);
            wb = new XSSFWorkbook(fis);
        }
        catch(Exception e){
            e.printStackTrace();
        }

    }
    public String getData(int sheetNumber,int row,int col){

        sheet1 = wb.getSheetAt(sheetNumber);
        String data = sheet1.getRow(row).getCell(col).getStringCellValue();
        return data;
    }
}
