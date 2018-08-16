package tests;

import java.io.File;
import java.io.FileInputStream;
import java.lang.reflect.Method;
import java.util.ArrayList;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;


public class ReflectionTest {

	public ArrayList <String> getExcelData() {
		ArrayList<String> lstMethods = new ArrayList<>();
		File f = new File("D:\\VB\\MyWorkspace\\m1.xlsx");
		try {
			FileInputStream fis = new FileInputStream (f);
			@SuppressWarnings("resource")
			XSSFWorkbook  wb = new XSSFWorkbook(fis);
			XSSFSheet  sheet = wb.getSheet("Sheet1");//wb.getSheet("Sheet1");)
			for(Row row : sheet) {
				Cell c1 = row.getCell(0);
				lstMethods.add(c1.getStringCellValue());
				//Cell c2 = row.getCell(1);
				//h.put(c1.getStringCellValue(), c2.getStringCellValue());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return lstMethods;
	}
	
	@Test
	public void myTest1() {
		ArrayList<String> a = getExcelData();
		for (String mName : a) {
			try {
				Class c = Class.forName("tests.ReflectionTest");
				Object o= c.newInstance();
				Method m =c.getMethod(mName, null);
				m.setAccessible(true);  
				m.invoke(o, null);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	
	
	public void add() {
		System.out.println("This is Add");
	}
	
	public void show() {
		System.out.println("This is Show");
	}
	
	public void multi() {
		System.out.println("This is Multi");		
	}
	
	
	
	
}
