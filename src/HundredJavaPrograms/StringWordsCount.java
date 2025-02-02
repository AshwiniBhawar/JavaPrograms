package HundredJavaPrograms;

public class StringWordsCount {

	public static void main(String[] args) {
		//String s1 = "Java is an object oriented and programming language";
		String s1=" ";
		char c[] = s1.toCharArray();
		int count = 0;

		if (c[0] != ' ') {
			count = 1;
			for (int i = 0; i < c.length; i++) {

				if (c[i] == ' ' && c[i + 1] != ' ') {
					count++;
				}
			}

		}

		if (count == 0) {
			System.out.println("String is empty");
		} else {
			System.out.println("String contains " + count + " words");
		}
	}

}
