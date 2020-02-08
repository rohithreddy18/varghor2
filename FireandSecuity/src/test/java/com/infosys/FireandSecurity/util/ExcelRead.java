package com.infosys.FireandSecurity.util;

import java.io.FileInputStream;
import java.io.IOException;


import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
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

		
		
		public String getCellData(int colNum,int rowNum)
	    {
	        try
	        {
	        	FileInputStream fis = new FileInputStream("C:\\Users\\rohit\\Documents\\Employeedetails.xlsx");
				XSSFWorkbook workbook = new XSSFWorkbook(fis);
				XSSFSheet sheet = workbook.getSheetAt(0);
	           Row  row = sheet.getRow(rowNum);
	           Cell  cell = row.getCell(colNum);
	            if(cell.getCellTypeEnum() == CellType.STRING)
	                return cell.getStringCellValue();
	            else if(cell.getCellTypeEnum() == CellType.NUMERIC || cell.getCellTypeEnum() == CellType.FORMULA)
	            {
	                String cellValue  = String.valueOf(cell.getNumericCellValue());
	               
	                return cellValue;
	            }else if(cell.getCellTypeEnum() == CellType.BLANK)
	                return "";
	            else
	                return String.valueOf(cell.getBooleanCellValue());
	        }
	        catch(Exception e)
	        {
	            e.printStackTrace();
	            return "row "+rowNum+" or column "+colNum +" does not exist  in Excel";
	        }
	    }
	     
	   
	     
	   
	     
	     
	    @DataProvider(name="userData")
	    public static Object[][] userFormData() throws Exception
	    {
	    	ExcelRead er=new ExcelRead();
	        Object[][] data = er.testData();
	        return data;
	    }
	     
	    public Object[][] testData() throws Exception
	    {
	        Object[][] excelData = null;
	        FileInputStream fis = new FileInputStream("C:\\Users\\rohit\\Documents\\Employeedetails.xlsx");
			XSSFWorkbook workbook = new XSSFWorkbook(fis);
			XSSFSheet sheet = workbook.getSheetAt(0);
			int rows=sheet.getLastRowNum();
			int columns=sheet.getRow(0).getLastCellNum();
	                 
	        excelData = new Object[rows-1][columns];
	         
	        for(int i=1; i<rows; i++)
	        {
	            for(int j=0; j<columns; j++)
	            {
	                
	            	
	            	
	            	excelData[i-1][j] = getCellData(j, i);
	            }
	             
	        }
	        return excelData;
	    }
	}


