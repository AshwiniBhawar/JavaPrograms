package HundredJavaPrograms;

import java.util.Arrays;
import java.util.Collections;

public class ArraySorting {

	public static void main(String[] args) {
		
		int a[]= {10,80,30,90,50,40};
		System.out.println("Element before sorting:"+ Arrays.toString(a));
		Arrays.parallelSort(a);
		System.out.println("Element after sorting:"+ Arrays.toString(a));

		System.out.println("Element before sorting:"+ Arrays.toString(a));
		Arrays.sort(a);
		System.out.println("Element after sorting:"+ Arrays.toString(a));

		Integer b[]= {10,80,30,90,50,40};
		System.out.println("Element before sorting:"+ Arrays.toString(b));
		Arrays.sort(b, Collections.reverseOrder());							//We can not use non primitive data type for Collection
		System.out.println("Element after sorting:"+ Arrays.toString(b));
	}

}
