import Lib.ExcelDataConfig;
import Lib.WriteExcelConfig;

import java.io.IOException;

public class setExcelData {

    public static void main(String args[]) throws IOException {

        WriteExcelConfig exc = new WriteExcelConfig("C:\\Users\\soumya.penuguvvi\\Documents\\Preparation\\CoreJavaPrac\\Excel Data\\TestData.xlsx");
        exc.setData(2,0,0,"Pass","C:\\Users\\soumya.penuguvvi\\Documents\\Preparation\\CoreJavaPrac\\Excel Data\\TestData.xlsx");
        System.out.println("Write successfull");
    }

}
