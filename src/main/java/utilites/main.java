package utilites;

import java.io.IOException;

public class main {
	public static void main(String[] args) throws IOException {
		String str[][]=ExcelHandling.exceldata();
		for(int i=0;i<str.length;i++) {
			for(int j=0;j<str.length;j++) {
				System.out.println(str[i][j]);
			}
		}
	}

}
