package HundredJavaPrograms;

public class StringReverseEachWord {

	public static void main(String[] args) {
		
		String str= "Java a World";			//original string	
		String words[]=str.split(" ");		//splitting string into word
		//String words[]=str.split("\\s");
		String revString=" ";
		
		//Approach 1
		/*
		for(String w:words)
		{
			String revWord="";
			
			for(int i=w.length()-1;i>=0;i--) {
				revWord=revWord+w.charAt(i);
			
			}
			
			revString= revString + revWord + " ";
		}*/
		
		//Approach 2
		 for(String w:words)
		{
			
			StringBuilder sb= new StringBuilder(w);
			sb.reverse();
			
			revString= revString + sb.toString() + " ";
		}
		

		System.out.println(revString);
		
		
	}

}
