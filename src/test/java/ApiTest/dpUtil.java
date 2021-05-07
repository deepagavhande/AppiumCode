package ApiTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class dpUtil {
	public static Object [][] getUtildata() throws IOException {

			File f = new File("C:\\Users\\lenovo\\Desktop\\Book1.xlsx");
			FileInputStream excel = new FileInputStream(f);
			XSSFWorkbook exl = new XSSFWorkbook(excel);
			Sheet exl1 = exl.getSheet("Sheet1");
			System.out.println(exl1.getRow(0).getLastCellNum() );
Object [][] returnArray = new Object[exl1.getLastRowNum()][exl1.getRow(0).getLastCellNum()];

			for (int i = 0; i <exl1.getLastRowNum(); i++) {

				for (int j =0; j <exl1.getRow(0).getLastCellNum(); j++) {
					
					returnArray[i][j]=exl1.getRow(i+1).getCell(j).toString();
		}
			}
			return returnArray;

}
	
	

}

