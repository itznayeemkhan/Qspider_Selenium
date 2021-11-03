package datadriventesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class GettingDataFromExcel {

	public static void main(String[] args) throws Exception {
		String filepath = "./resources/excelData1.xlsx";
		String sheetName="TC01";
		FileInputStream file = new FileInputStream(filepath);
	 Workbook workBook=WorkbookFactory.create(file);
	String url = workBook.getSheet(sheetName).getRow(1).getCell(0).getStringCellValue();
	String username = workBook.getSheet(sheetName).getRow(1).getCell(0).getStringCellValue();
	String password = workBook.getSheet(sheetName).getRow(1).getCell(0).getStringCellValue();
	System.out.println(url);
	System.out.println(username);
	System.out.println(password);
	

	}

}
