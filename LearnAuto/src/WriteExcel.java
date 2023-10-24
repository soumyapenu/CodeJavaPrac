import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class WriteExcel {

    public static void main(String[] args) throws Exception {

        File src = new File("C:\\Users\\soumya.penuguvvi\\Documents\\Preparation\\CoreJavaPrac\\Excel Data\\TestData.xlsx");

        FileInputStream fis = new FileInputStream(src);

        XSSFWorkbook wb = new XSSFWorkbook(fis);

        XSSFSheet sheet1 = wb.getSheetAt(0);

        sheet1.getRow(0).createCell(2).setCellValue("Pass");
        sheet1.getRow(1).createCell(2).setCellValue("Fail");
        sheet1.getRow(2).createCell(2).setCellValue(14.21);

        FileOutputStream fout = new FileOutputStream(src);
        wb.write(fout);
        wb.close();
    }
}

