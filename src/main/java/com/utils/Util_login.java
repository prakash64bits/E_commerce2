package com.utils;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Util_login {
	

	//import com.util.DataProvider;  it is login 

	
		 static String filepath="./src/main/java/com/TestData_3/jakkam.xlsx";
		//@Test               //print option wise we given test hear
			//@DataProvider(name="usercredentials")      //for add to next pro
			
			public static String[][] setdata (String sheetname) throws Throwable {
				
			File file=new File(filepath);
			FileInputStream stream=new FileInputStream(file);       //it show method calling   PVM
			XSSFWorkbook workbook=new XSSFWorkbook (stream);
			XSSFSheet sheet=workbook.getSheetAt(0);
			
			int row=sheet.getPhysicalNumberOfRows();
			int cells=sheet.getRow(0).getLastCellNum();
			String[][] data=new String[row-1][cells];
			for(int i=2; i<row-1;i++) {
				for( int j=0;j<cells;j++) {
					//System.out.println(sheet.getRow(i).getCell(j));
					//data[i][j]=sheet.getRow(i+1).getCell(j);
					DataFormatter df=new DataFormatter();
					data[i][j] = df.formatCellValue(sheet.getRow(i+1).getCell(j));
					System.out.println(data[i][j]);
				}
			}
			        
			workbook.close();
			stream.close();
			return data; 
			}
		}


