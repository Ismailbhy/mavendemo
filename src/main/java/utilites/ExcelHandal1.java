package utilites;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelHandal1 {
	public static String[][] excelData() throws IOException {
		//locate the excel file fileinputstream
		FileInputStream fis=new FileInputStream("C:\\Users\\ismai\\Downloads\\Book4.xlsx");
//		xssfworkbook is used to handle .xlsx files
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		System.out.println(wb.getNumberOfSheets());
		XSSFSheet sh = wb.getSheet("Sheet1");
		int rowcount = sh.getPhysicalNumberOfRows();
		int colmcount = sh.getRow(0).getPhysicalNumberOfCells();
		System.out.println(rowcount);
		System.out.println(colmcount);
		String[][] data=new String[rowcount][colmcount];
	
		for(int i=0;i<rowcount;i++) {
			for(int j=0;j<colmcount;j++)
			 
				System.out.println(sh.getRow(i).getCell(j).getStringCellValue());
			}
		System.out.println();
		return data;
		}
		
	
	}


