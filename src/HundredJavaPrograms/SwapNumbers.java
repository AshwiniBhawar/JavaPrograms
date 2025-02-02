package HundredJavaPrograms;

import java.util.Scanner;

public class SwapNumbers {
	
	
	public static void main(String[] args) {
	
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a 1st value");
		int num1=sc.nextInt();
		System.out.println("Enter a 2nd value");
		int num2=sc.nextInt();
		int temp;
		
		System.out.println("Before Swapping:");
		System.out.println("Value of num1 :"+ num1);
				
		System.out.println("Value of num2 :"+ num2);
		/*
		temp=num1;
		num1=num2;
		num2=temp;
		*/
		
		/*
		num1=num1+num2;		//10+20=30
		num2=num1-num2;		//30-20=10
		num1=num1-num2;		//30-10=20
		*/
		
		/*		(a and b values should not be 0 else it will give arithmetic exception)
		num1= num1*num2;	//10*20=200
		num2= num1/num2	;	//200/20=10
		num1=num1/num2;		//200/10=20
		*/
		
		/*(Using XOR operator; This works on binary basis- if 2 values are diff then 1 else 0.)
		 num1=num1^num2;
		 num2=num1^num2;
		 num1=num1^num2;
		 */
		
		//using single statement
		num2=num1+num2 -(num1=num2);
		
		System.out.println("After Swapping:");
		System.out.println("Value of num1 :"+ num1);
				
		System.out.println("Value of num2 :"+ num2);
	}

}
