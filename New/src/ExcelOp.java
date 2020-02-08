import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelOp {

	public ExcelOp() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static Object[][] excelRead() throws Throwable{
		
		Object[][] datab =null;
		FileInputStream fis=new FileInputStream("D:\\Book.xlsx");
		XSSFWorkbook xw=new XSSFWorkbook(fis);
		XSSFSheet sheet=xw.getSheetAt(0);
		int rows = sheet.getLastRowNum();
		int columns= sheet.getRow(0).getLastCellNum();
		
		for(int i=1;i<rows;i++) {
			
			for(int j=0;j<columns;j++) {
				
				//datab[i-1][j] = getCellData(j,i);
			}
		}
		return datab;		
	}
	
	/*public static String getCellData(int columnval,int rowval) {
		
		
	}*/

}
