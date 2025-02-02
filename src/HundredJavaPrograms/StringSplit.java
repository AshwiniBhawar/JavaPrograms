package HundredJavaPrograms;

public class StringSplit {

	public static void main(String[] args) {
		
		String s= "Wel-come";
		
		String s1[]=s.split("-");
		//System.out.println(s1[0]);
		//System.out.println(s1[1]);
		
		for(String w:s1){   
			System.out.println(w);   
			}
	}

}
