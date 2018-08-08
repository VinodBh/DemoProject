package tests;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CT {
	@Test
	public void test1() {
		System.setProperty("webdriver.chrome.driver", "D:\\VB\\MyWorkspace\\Driver\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("http://demoqa.com/registration");
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		WebElement e = d.findElement(By.id("name_3_firstname1"));
		List<WebElement> txtBoxList2 = d.findElements(By.xpath("//input[@class='input_fields  piereg_validate[required] input_fields2']"));
		System.out.println(e);
		System.out.println(txtBoxList2.size());
	}
}
