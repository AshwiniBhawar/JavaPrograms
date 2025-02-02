package HundredJavaPrograms;

public class MethodCreation {
	
	MethodCreation(){
		System.out.println("I am in constructor");
	}

	public static void staticMethod() {
		System.out.println("I am in static method");
	}
	
	public void nonStaticMethod() {
		System.out.println("I am in non static method");
	}
	public static void main(String[] args) {
		
		staticMethod();
		MethodCreation m1= new MethodCreation();
		m1.nonStaticMethod();
	
	}

}
