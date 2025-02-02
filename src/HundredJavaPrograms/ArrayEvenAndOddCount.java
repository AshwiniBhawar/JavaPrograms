package HundredJavaPrograms;

import java.util.Scanner;

public class ArrayEvenAndOddCount {

	public static void main(String[] args) {
		
		int a[]= {0,1,2,3,4,5,6,7,8,9,10};
		
		int evenCount=0;
		int oddCount=0;
		System.out.println("Even number in an array......");
		for(int i=0;i<a.length;i++) {
			
			if(a[i]%2==0) 
			{	
				System.out.println(a[i]);
				evenCount++;
			}
			
		}
		
		System.out.println("Odd number in an array......");
		for(int i=0;i<a.length;i++) {
			
			if(a[i]%2!=0) 
			{	
				System.out.println(a[i]);
				oddCount++;
			}
		}
		
		System.out.println("The count of even number is:" +evenCount);
		System.out.println("The count of odd number is:" +oddCount);

	}}
