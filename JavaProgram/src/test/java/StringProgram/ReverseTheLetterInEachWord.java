package StringProgram;

public class ReverseTheLetterInEachWord {
	
	public static void main(String[] args) {
		
		String s="Java is program";
		
		String ss[]=s.split(" ");
		
		for(String word:ss)
		{
		
		for(int i=word.length()-1;i>=0;i--)
		{
			
			System.out.print(word.charAt(i));
			
		}
		System.out.println(" ");
		}
	}

}
