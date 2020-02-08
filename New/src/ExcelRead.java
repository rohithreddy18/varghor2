import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ExcelRead {

	public void excelRead() throws IOException {

		FileInputStream fis = new FileInputStream("C:\\Users\\rohit\\Documents\\Employeedetails.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheetAt(0);
		int lastrownum = sheet.getLastRowNum();
		for (int i = 0; i < lastrownum; i++) {

			Row row = sheet.getRow(i);
			if (row != null) {
				int lastcellnum = row.getLastCellNum();

				for (int j = 0; j < lastcellnum; j++) {

					Cell cellvalue = row.getCell(j);

					if (cellvalue != null) {
						if (cellvalue.getCellType() == CellType.NUMERIC) {
							System.out.println(cellvalue.getNumericCellValue());
						} else {
							System.out.println(cellvalue.getStringCellValue());
						}
						{
						}

					}
				}
			}

		}
	
	

	
		// TODO Auto-generated constructor stub
	}
	@Test
	public void testcase1() throws IOException {
		excelRead();
	}

}
