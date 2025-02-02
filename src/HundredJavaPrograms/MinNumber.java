package HundredJavaPrograms;

import java.util.Scanner;

public class MinNumber {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a first number");
		int num1= sc.nextInt();
		System.out.println("Enter a second number");
		int num2= sc.nextInt();
		System.out.println("Enter a thrid number");
		int num3= sc.nextInt();
		
		if(num1<num2 && num1<num3) {
			
			System.out.println(num1+" is less than "+num2+" and "+num3);
		}
		
		else if(num2<num1 && num2<num3) {
			
			System.out.println(num2+" is less than "+num1+" and "+num3);
		}
		else {
			System.out.println(num3+" is less than "+num1+" and "+num2);
		}
	}

}
