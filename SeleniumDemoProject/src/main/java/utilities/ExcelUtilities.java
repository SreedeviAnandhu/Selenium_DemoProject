package utilities;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import constants.Constants;

public class ExcelUtilities {
	
	static FileInputStream f;
	static XSSFWorkbook w;
	static XSSFSheet sh;
	
	public static String readStringData(int row,int col,String Sheet) throws IOException
	{
		String filepath = Constants.TESTDATAFILE;
		f=new FileInputStream(filepath);
		w=new XSSFWorkbook(f);
		sh=w.getSheet(Sheet);
		XSSFRow r=sh.getRow(row);
		XSSFCell c=r.getCell(col);
		return c.getStringCellValue();
	}
	
	public static String readIntegerData(int row,int col,String Sheet) throws IOException
	{
		String filepath = Constants.TESTDATAFILE;
	     f=new FileInputStream(filepath);
		 w=new XSSFWorkbook(f);
		 sh=w.getSheet(Sheet);
		 XSSFRow r=sh.getRow(row);
		 XSSFCell c=r.getCell(col);
		 int val = (int)c.getNumericCellValue(); //return chyunnath double value ann so (int) use chythath
		 return String.valueOf(val);  //int ine stringilott mattan
		 
		 
	 }

}