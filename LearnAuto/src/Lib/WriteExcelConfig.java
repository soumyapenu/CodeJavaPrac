package Lib;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.*;

public class WriteExcelConfig {

    XSSFWorkbook wb;
    XSSFSheet sheet1;

    public WriteExcelConfig(String filePath){
       try {
           File src = new File(filePath);
           FileInputStream fis = new FileInputStream(src);
           wb = new XSSFWorkbook(fis);
       }
       catch(Exception e){
           e.printStackTrace();
       }
    }
    public void setData(int sheetNumber, int row, int col,String data,String filePath1) throws IOException {
        String path = filePath1;
        sheet1 = wb.getSheetAt(sheetNumber);
        sheet1.createRow(row).createCell(col).setCellValue(data);
        FileOutputStream fout = new FileOutputStream(path);
        wb.write(fout);
        wb.close();
    }
}
