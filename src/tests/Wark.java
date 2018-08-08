package tests;

public class Wark extends Animal {
	
	public void eat() {
		System.out.println("Wark Eat");
	}
	
	public void eat(String a) {
		System.out.println("Wark = Eat with string");
	}
	
	
	public String eat(int a) {
		System.out.println("Wark = eat with int");
		return null;
	}
	
	public void walk(String a) {
		System.out.println("Wark - Walk with string");
	}

	
}
