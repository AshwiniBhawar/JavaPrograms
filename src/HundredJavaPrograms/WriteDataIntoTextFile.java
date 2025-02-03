package HundredJavaPrograms;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteDataIntoTextFile {

	public static void main(String[] args) throws IOException {
		
		
		//Approach 3
		FileWriter file1= new FileWriter("D:\\Selenium\\ReadFile.txt");
		BufferedWriter br= new BufferedWriter(file1);
		
		br.write("Learning is a key to sucess");
		
		System.out.println("finished");
		br.close();
	}

}
