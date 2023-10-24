import Lib.ExcelDataConfig;

public class Excel {

    public static void main(String args[]){

        ExcelDataConfig exc = new ExcelDataConfig("C:\\Users\\soumya.penuguvvi\\Documents\\Preparation\\CoreJavaPrac\\Excel Data\\TestData.xlsx");
        String data = exc.getData(1,0,1);
        System.out.println("Data is: "+data);
    }

}
