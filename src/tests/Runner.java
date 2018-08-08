package tests;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.testng.TestNG;
public class Runner {
	static HashMap<String, String> tcl= null;
	
	public static void main(String[] args) {
		TestCases.loadConfigDetails();
		ExcelUtils s = new ExcelUtils();
		tcl = s.getExcelData();
		TestNG testng = new TestNG();
		List<String> suites = new ArrayList<String>();
		suites.add(TestCases.properties.getProperty("testNGXMLPath"));
		testng.setTestSuites(suites);
		testng.run();
	}
}