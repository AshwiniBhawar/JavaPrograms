package HundredJavaPrograms;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayMinAndMax {

	public static void main(String[] args) {
		
		int array[]= {10,20,2,40,10,5,3};
		Arrays.sort(array);
		
		/*int length=array.length;
		System.out.println("The length of array is "+ length);
		int temp;
		for(int i=0;i<array.length;i++) {
			
			for(int j=i+1;j<array.length;j++) {
				
				if(array[i]>array[j]) {
					
					temp= array[i];
					array[i]= array[j];
					array[j]=temp;
					
				}
			}
				
		}*/	
		System.out.println("The maximum number is "+ array[array.length-1]);
		System.out.println("The minimum number is "+ array[0]);
			
	}

}
