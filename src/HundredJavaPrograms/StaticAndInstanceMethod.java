package HundredJavaPrograms;

public class StaticAndInstanceMethod {

	public static void m1() {
		System.out.println("I am in static method");
	}

	public void m2() {

		System.out.println("I am in static method");

	}

	public static void main(String[] args) {

		m1(); // static method can be accessed directly without creating an object

		StaticAndInstanceMethod si = new StaticAndInstanceMethod();

		si.m2(); // instance method can be accessed through an object reference only

	}

}
