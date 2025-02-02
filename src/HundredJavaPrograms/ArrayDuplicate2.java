package HundredJavaPrograms;

import java.util.HashSet;

public class ArrayDuplicate2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {10,20,30,10,40,50};
		int b[]= {};
		boolean flag=false;
		
		HashSet hs= new HashSet();
		for(int i=0;i<a.length;i++) {
		if(hs.add(a[i])==false) {
			System.out.println("Duplicate element is present" +a[i]);
			flag=true;
		}
		}
		
		if(flag==false) {
			System.out.println("Duplicate element is not present");
		}
		
		/*Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number");
		int duplicate= sc.nextInt();
		int count=0;
		for(int i=0;i<a.length;i++) {
			
			if(a[i]==duplicate) {
				count++;
			}
		}
		
		if(count==0) {
			System.out.println("The given number is not present in the array");
		}
		else {
			System.out.println("The "+duplicate+" is present in the array " +count+ " times" );
		}
		*/
		
}
	}

