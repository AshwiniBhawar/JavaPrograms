package HundredJavaPrograms;

import java.util.Scanner;

public class NumberLargestOfThree {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a first number");
		int num1= sc.nextInt();
		System.out.println("Enter a second number");
		int num2= sc.nextInt();
		System.out.println("Enter a thrid number");
		int num3= sc.nextInt();
		
		//logic1-- Logical operator
		
		/*if(num1>num2 && num1> num3) {
			
			System.out.println(num1+" is greater than "+num2+" and "+num3);
		}
		else if(num2>num1 && num2> num3) {
			
			System.out.println(num2+" is greater than "+num1+" and "+num3);
		}
		else {
			System.out.println(num3+" is greater than "+num1+" and "+num2);
		}*/
		
		//logic2-- Ternary operator
		
		int largest= num1>num2 ? num1 : num2;
		largest= largest>num3 ? largest : num3;
		System.out.println("The largest number is: "+largest);
		
	}

}
