package HundredJavaPrograms;

import java.util.Scanner;

public class NumberCount {

	public static void main(String[] args) {
		int count=0;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number");
		
		/*
		String userinput=sc.next();
		for(int i=0;i<userinput.length();i++) {	
			count++;	
		}
	    */
		//1234
		int num1=sc.nextInt();
		int originalNum= num1;
		
		if(num1==0) {
			count++;
		}
		
		while(num1!=0) {		
			num1=num1/10; 	
			count++;
		}
		
		System.out.println("The number of digits in "+ originalNum + " is " +count);
		}
}
