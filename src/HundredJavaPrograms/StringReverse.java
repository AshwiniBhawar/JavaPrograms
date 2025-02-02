package HundredJavaPrograms;

import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a string : ");
		String userinput= sc.next();
		
		//Using concatenation operator
		/*
		 * String rev= "";
		for(int i= userinput.length()-1; i>=0; i--) {
			rev=rev + userinput.charAt(i);
		}
		*/
		
		//Using character array
		String rev= "";
		char c[]=userinput.toCharArray();
		for(int i= userinput.length()-1; i>=0; i--) {
			rev= rev+c[i];
		}
	
	
		//Using StringBuilder class
		/*
		StringBuilder sb= new StringBuilder(userinput);
		StringBuilder rev= sb.reverse(); 
		*/
		
		
		//Using StringBuffer class
		/*
		StringBuffer sb= new StringBuffer();
		sb.append(userinput);
		StringBuffer rev= sb.reverse();
		*/
				
		System.out.println("Reverse of "+ userinput + " is: " +rev);
		
		
	}	

}
