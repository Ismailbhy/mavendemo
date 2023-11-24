package utilites;


import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelmug1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream fis = new FileInputStream("https://d.docs.live.net/ed2597a953506622/Documents/Bookutilities.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sh = wb.getSheet("Sheet1");
		int rowcount = sh.getPhysicalNumberOfRows();
		int colcount = sh.getRow(0).getPhysicalNumberOfCells();
		System.out.println("total row: "+rowcount);
		System.out.println("Total colume: "+colcount);
		
		

	}

}
