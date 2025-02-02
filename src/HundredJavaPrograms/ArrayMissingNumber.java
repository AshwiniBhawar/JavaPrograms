package HundredJavaPrograms;

public class ArrayMissingNumber {

	public static void main(String[] args) {
		//Arrays should not have any duplicates
		//Arrays should not be in sorted order
		//Values should be in range
		
		int a[]= {1,2,3,4,6};
		
		/*
		 * int diff=0;
		for(int i=0;i<a.length-1;i++) {
			
			diff= a[i+1]-a[i];
			
			if(diff!=1) {
				
				int missingnum=a[i]+1;
				System.out.println(missingnum +" is a missing number");
			}
		}
	*/
		int sum1=0;
		
		for(int i=0;i<a.length;i++) {
			sum1=sum1 + a[i];
		}
		System.out.println("Sum of array elements is:"+sum1);
		
		int sum2=0;
		for(int i=1;i<=6;i++) {
			sum2=sum2 + i;
		}
		System.out.println("Sum of range of array elements is:"+sum2);
		
		System.out.println("The missing number is "+ (sum2-sum1));

}
}
