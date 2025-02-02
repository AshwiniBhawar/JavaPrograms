package HundredJavaPrograms;

class MultipleClass {
	MultipleClass() {
		System.out.println("Constructor of MultipleClass..");
	}

	void multipleclass_method() {
		System.out.println("Method of MultipleClass...");
	}

	public static void main(String[] args) {
		MultipleClass my = new MultipleClass();
		my.multipleclass_method();
		
		SingleClass your = new SingleClass();
		your.singleclass_method();
	}
}

 class SingleClass {
	SingleClass() {
		System.out.println("Constructor of SingleClass..");
	}

	void singleclass_method() {
		System.out.println("Method of SingleClass..");
	}
}

// multiple classes are allowed in a single file. you can add only one public class at the start
