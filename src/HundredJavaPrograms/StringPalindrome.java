package HundredJavaPrograms;

import java.util.Scanner;

public class StringPalindrome {

	public static void main(String[] args) {
		/*
		String s= "Selenium";
		String rev= "";
		
		char c[]=s.toCharArray();
		
		for(int i= s.length()-1; i>=0; i--) {
			 rev= rev+c[i];
			
		}
		System.out.println("Reverse of "+ s+ " is: " +rev);*/
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a string : ");
		String userinput= sc.next();
		
		StringBuilder sb= new StringBuilder(userinput);
		StringBuilder rev= sb.reverse();
		//System.out.println(rev);
		System.out.println(rev.toString());
		
		
		
		if(userinput.equals(rev.toString())){
			System.out.println("String is palindrome");
		}
		else {
			System.out.println("String is not palindrome");
		}
		
	}	

}
