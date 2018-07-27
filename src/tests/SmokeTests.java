package tests;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.HashMap;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;
import org.testng.annotations.Test;

public class SmokeTests implements IAnnotationTransformer {



	@Test
	public HashMap<String, String> getExcelData() {
		HashMap<String, String> h = new HashMap<>();
		File f = new File("D:\\VB\\TestData\\TestCases.xlsx");
		try {
			FileInputStream fis = new FileInputStream (f);
			XSSFWorkbook  wb = new XSSFWorkbook(fis);
			XSSFSheet  sheet = wb.getSheet("Sheet1");
			for(Row row : sheet) {
				Cell c1 = row.getCell(0);
				Cell c2 = row.getCell(1);
				h.put(c1.getStringCellValue(), c2.getStringCellValue());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return h;
	}


	@Override
	public void transform(ITestAnnotation arg0, Class arg1, Constructor arg2, Method arg3) {
		System.out.println(arg0.toString());
		System.out.println(arg1.toString());
		System.out.println(arg2.toString());
		System.out.println(arg3.toString());
		arg0.setEnabled(false);

	}



}

