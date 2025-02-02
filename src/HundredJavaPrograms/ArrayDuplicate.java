package HundredJavaPrograms;

import java.util.HashSet;
import java.util.Scanner;

public class ArrayDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {10,20,30,40,20,30};
		boolean flag=false;
		
		
//approach 1		
		/*HashSet<Integer> hs= new HashSet<Integer>();
		
		for(int h: a) {
			
			if(hs.add(h)==false);{
				System.out.println("Duplicate element found"+ hs);
				flag=true;
			}
			
		}
		if(flag==false) {
			System.out.println("Duplicate element is not found");
		}*/
		
//approach 2		
		/*for(int i=0;i<a.length;i++) {
		
			for(int j=i+1;j<a.length;j++) {
				
				if(a[i]==a[j]) {
					System.out.println("Duplicate element is found"+ a[i]);
					flag=true;
				}
				
			}
		}
		
		if(flag==false) {
			System.out.println("Duplicate element is not found");
		}
		
		*/
		
		
//approach 3
		
		 Scanner sc= new Scanner(System.in);
		 System.out.println("Enter the number:");
		 int searchNumber=sc.nextInt();
		 int duplicate=0;
		 for(int i=0 ;i<a.length;i++) {		//for(int i: a)
			 
			 if(a[i]==searchNumber) {		//(i==searchNumber)
				 
				 duplicate++;
		 }
	
		 }
		 System.out.println("The number of " +searchNumber +" repeated is: "+ duplicate);

	}

}


