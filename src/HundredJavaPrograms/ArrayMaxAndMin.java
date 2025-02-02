package HundredJavaPrograms;

import java.util.Arrays;

public class ArrayMaxAndMin {

	public static void main(String[] args) {
		int a[]= {6,2,13,4,1,50,8};
		int max=a[0];
		int min=a[0];
		/*Arrays.sort(a);
		int length=a.length;
		System.out.println("The length of an array is :"+length);
		
		System.out.println("The maximum number is:" + a[0]);
		System.out.println("The maximum number is:" + a[length-1]);
		*/
		
		for(int i=0;i<a.length;i++) 
		{
				if(a[i]>max) 
				{
					max=a[i];
				}
		}
		
		System.out.println("The maximum number is:" + max);
		
		for(int i=0;i<a.length;i++) 
		{
				if(a[i]<min) 
				{
					min=a[i];
				}
		}
		
		System.out.println("The minimum number is:" +min);
	}

}
