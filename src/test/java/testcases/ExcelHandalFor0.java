package testcases;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelHandalFor0 {
	public static String[] excelData() throws IOException{
		FileInputStream fis= new FileInputStream("C:\\Users\\ismai\\OneDrive\\Documents\\Book0.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		System.out.println(wb.getNumberOfSheets());
		XSSFSheet sh = wb.getSheet("Sheet1");
		int rowcount = sh.getPhysicalNumberOfRows();
		int colmcount = sh.getRow(0).getPhysicalNumberOfCells();
		System.out.println(rowcount);
		System.out.println(colmcount);
		String []states=new String[rowcount];
		for (int i=0;i<rowcount;i++) {
			states [i]=sh.getRow(i).getCell(0).getStringCellValue();
			System.out.println(states[i]);
			System.out.println("  ");
		}
		return states;
		
		
	}


}


