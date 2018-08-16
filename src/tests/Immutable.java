package tests;

public class Immutable {

	static void change(String in) { 
	  in = in + " changed";
	  System.out.println("in change method " + in);
	}

	static void change(StringBuffer in) {
	  in.append(" changed");
	}

	public static void main(String[] args) {
	   StringBuffer sb = new StringBuffer("value");
	   String str = "value";
	   change(sb);
	   change(str);
	   System.out.println("StringBuffer: "+sb);
	   System.out.println("String: "+str);
	}
}
