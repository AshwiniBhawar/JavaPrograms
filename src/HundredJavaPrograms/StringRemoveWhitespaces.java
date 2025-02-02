package HundredJavaPrograms;

import java.util.Scanner;

public class StringRemoveWhitespaces {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a String:");
		String s1=sc.nextLine();			//Accept multiple words (next() accept single word)
		
		System.out.println("String before removing whitespaces: " +s1);
		
		s1=s1.replaceAll(" ", "");
		//s1=s1.replaceAll("\\s", "");
		System.out.println("String after removing whitespaces: " +s1);
	}

}
