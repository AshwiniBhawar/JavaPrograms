package HundredJavaPrograms;

public class StaticBlock {

	/*static {
		System.out.println("I am in static block");
	}*/
	
	 static { 
		    String os = System.getenv("OS"); 
		    if (os.equals("Windows_NT") != true) { 
		      System.exit(1); 
		    } 
		  } 

	public static void main(String[] args) {
		
		System.out.println("You are using Windows_NT operating system.");		//static block always execute before main method

	}

}
