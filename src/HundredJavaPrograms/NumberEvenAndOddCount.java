package HundredJavaPrograms;

public class NumberEvenAndOddCount {

	public static void main(String[] args) {

		int num = 123;
		int evencount = 0;
		int oddcount = 0;
		while (num > 0) {
			
			int rem = num % 10;
			
			if (rem % 2 == 0) 
			{
				evencount++;
			} 
			else 
			{
				oddcount++;
			}
			
			num = num / 10;
		}
		
		System.out.println("The even count is : " + evencount);
		System.out.println("The odd count is : " + oddcount);
	}

}
