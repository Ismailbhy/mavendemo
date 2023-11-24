package utilites;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelHandling {
	public static String[][] exceldata() throws IOException {
	FileInputStream fis = new FileInputStream("C:\\Users\\ismai\\OneDrive\\Documents\\Bookutilities.xlsx");
	XSSFWorkbook wb = new XSSFWorkbook(fis);
	XSSFSheet sh = wb.getSheet("Sheet1");
	int rowcount = sh.getPhysicalNumberOfRows();
	int colcount = sh.getRow(0).getPhysicalNumberOfCells();
	System.out.println("Total row: "+rowcount);
	System.out.println("Total colume: "+colcount);
	String[][] data=new String[rowcount][colcount];
	for(int i=0;i<rowcount;i++) {
		for(int j=0;j<colcount;j++) {
			data[i][j]=sh.getRow(i).getCell(j).getStringCellValue();
			//System.out.println(sh.getRow(i).getCell(j).getStringCellValue());
		}
	}
	return data;
	/* to read the excel and store that in a array; going to use this array in test class as a data provider i can use mulltifull times;
	 * it is used for read your excel*/
	}
}
