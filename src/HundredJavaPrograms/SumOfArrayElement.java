package HundredJavaPrograms;

public class SumOfArrayElement {

	public static void main(String[] args) {
		
		int a[]= {10,20,30,40,50,60};
		int sum=0;
		for(int i=0; i<a.length;i++){
			
			sum=sum+a[i];
			
		}
		System.out.println("The sum of array elements is : "+ sum);
	
	/*
	 for(int al:a){
	         sum=sum+al;
	 }
	*/

}
}
