package com.JunitEx;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ActionUtils {
	String name;
	public  File file;
	public  FileInputStream fis;
	public  XSSFWorkbook wb;
	
	public  void enterText(WebElement element, String data) {
		element.sendKeys(data);
	}
	public  void click(WebElement element) {
		element.click();	
	}
	public  String getdata(String sheetName, int rowNum, int colNum) {
		try {
			 file = new File("D://login.xlsx");
		     fis= new FileInputStream(file);
			wb = new XSSFWorkbook(fis);
		} catch (IOException e) {
			e.printStackTrace();  }
        XSSFSheet sh = wb.getSheet(sheetName);
        if(sh.getRow(rowNum).getCell(colNum).getCellType() == HSSFCell.CELL_TYPE_STRING){ 
			 name = sh.getRow(rowNum).getCell(colNum).getStringCellValue(); 
        }
		if(sh.getRow(rowNum).getCell(colNum).getCellType() == HSSFCell.CELL_TYPE_NUMERIC){ 
			double num1= sh.getRow(rowNum).getCell(colNum).getNumericCellValue();
			int i=(int)num1;
			name=name.valueOf(i);
			 //System.out.println(name);
		}
		return name;
	}}
	
	

