package HundredJavaPrograms;

import java.util.Scanner;

public class StringCharacterOccurance {

	public static void main(String[] args) {
	
		String s1 = "Welcome to java tutorial";
		System.out.println(s1.length());
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the character");
		String userinput = sc.next();

		String s2 = s1.replaceAll(userinput, "");
		System.out.println(s2.length());
		int count = s1.length() - s2.length();
		
		System.out.println("The occurance of " + userinput + " is" + count);

	}

}
