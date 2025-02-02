package HundredJavaPrograms;

import java.util.Scanner;

public class StringCharOcc {

	public static void main(String[] args) {

		//Scanner sc = new Scanner(System.in);
		//System.out.println("Enter a String:");
		//String s1 = sc.nextLine();
		String s1= "Welcome to java world";
		
		//Approach 1
		int  totalcount=s1.length();
		int totalcount_afterremove=s1.replaceAll("o","").length();
		
		int length=totalcount-totalcount_afterremove;
		System.out.println("The char 'o' is repeated " + length + " times");
		
		//Approach 2
		char c1[] = s1.toCharArray();
		int count = 0;

		for (int i = 0; i < s1.length(); i++) {
			if (c1[i] == 'o') {
				count++;
			}
		}

		if (count > 1) {
			System.out.println("The char 'o' is repeated " + count + " times");
		} else {
			System.out.println("Char is not repeated");
		}
	}
}

