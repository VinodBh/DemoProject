package tests;

import java.util.Properties;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SampleTests {
	

	
	public static void main(String[] args) {
		Animal a = new Animal();
		Wark b = new Wark();
		Animal c = new Wark();
		
		a.eat();
		a.eat(2);
		a.run();
		System.out.println("-------------------------------------");
		
		
		b.eat();
		b.eat(3);
		b.eat("asdf");
		b.run();
		b.walk("xsz");
		System.out.println("-------------------------------------");
		
		
		c.eat();
		c.eat(5);
		c.run();
	}
	
}
