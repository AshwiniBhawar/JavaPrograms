package HundredJavaPrograms;

public class NumberSumOFDigits {

	public static void main(String[] args) {

		int num = 1236;
		int sum = 0;
		int rev= 0;
		 while(num>0)
		 { 
			 int rem=num%10; 
			 sum=sum+rem; 
			 num=num/10; 
		 }
		System.out.println("The sum of digit is: " + sum);

	}

}
