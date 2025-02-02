package HundredJavaPrograms;

import java.util.Random;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.RandomUtils;
import org.apache.commons.lang3.StringUtils;

public class GenerateRandomString {

	public static void main(String[] args) {
		
		//Using Random class
		Random rn= new Random();
		int num=rn.nextInt(20);
		
		Random rn1= new Random();
		double num1=rn1.nextDouble(10);
		System.out.println(num);
		System.out.println(num1);
		
		//Using Math
		System.out.println(Math.random());
		
		//Using Apache commons-lang API
		String random=RandomStringUtils.randomNumeric(10);
		System.out.println(random);
		
		String random1=RandomStringUtils.randomAlphanumeric(5);
		System.out.println(random1);

	}

}
