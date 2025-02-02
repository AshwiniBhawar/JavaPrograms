package HundredJavaPrograms;

public class FactorialOfNumber {

	public static void main(String[] args) {
		
		int num=7;
		long fact=1;
		
		/*for(int i=1;i<=num;i++) {
			
			fact=fact*i;		
		}*/
		int i=1;
		while(i<=num) {
			fact=fact*i;
			i++;
		}
		System.out.println(fact);
	}

}
