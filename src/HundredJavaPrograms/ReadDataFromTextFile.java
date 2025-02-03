package HundredJavaPrograms;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadDataFromTextFile {

	public static void main(String[] args) throws IOException {
		
		//Approach 1
		File file= new File("D:\\Selenium\\ReadFile.txt");
		Scanner sc= new Scanner(file);
		/*
		while(sc.hasNext()) {
			System.out.println(sc.nextLine());
		}
		*/
		
		//Approach 2
		sc.useDelimiter("\\Z");
		System.out.println(sc.next());
		
		//Approach 3
		FileReader file1= new FileReader("D:\\Selenium\\ReadFile.txt");
		BufferedReader br= new BufferedReader(file1);
		String str;
		while((str=br.readLine())!=null) {
			System.out.println(str);
		}
		br.close();
	}

}
