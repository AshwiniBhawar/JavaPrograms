package HundredJavaPrograms;

import java.util.Scanner;

public class NumberReverse {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number:");
		int num= sc.nextInt();
		
		/*int originalNum= num;
		int rev=0;
		
		while(num!=0) {
			rev=rev * 10;
			rev=rev + num%10;				
			num= num/10;
		} 
		*/
		
		//using StringBuffer class
		/*StringBuffer rev;
		StringBuffer sb= new StringBuffer(String.valueOf(num));
		rev=sb.reverse();
		*/
		
		//using StringBuilder class
		StringBuilder rev;
		StringBuilder sb= new StringBuilder();
		sb.append(num);
		rev=sb.reverse();
				
		System.out.println("Reverse number is: "+ rev);
	}

}
