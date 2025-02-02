package HundredJavaPrograms;

import java.util.Arrays;

public class ArrayEquality {

	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 5, 6 };
		int b[] = { 1, 2, 3, 4, 5, 6 };

		/*
		 * if(a.equals(b)) { System.out.println("Array a and b are equal"); }
		 * 
		 * else { System.out.println("Array a and b are not equal"); }
		 */
		/*
		 * boolean result= Arrays.equals(a,b);
		 * 
		 * if(result==true) { System.out.println("Array a and b is equal"); }
		 * 
		 * else{ System.out.println("Array a and b is not equal"); }
		 */
		boolean status = true;
		if (a.length == b.length) {
			for (int i = 0; i < a.length; i++) {

				if (a[i] != b[i])
				{
					status = false;
				}
			}

		}

		else {
			status = false;
		}

		if (status == true) {
			System.out.println("Arrays are equal");
		} else {
			System.out.println("Arrays are not equal");
		}
	}

}
