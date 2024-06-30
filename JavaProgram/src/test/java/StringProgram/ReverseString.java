package StringProgram;

public class ReverseString {
	
	public static void main(String[] args) {
		
		String s="java";
		for(int i=s.length()-1;i>=0;i--)
		{
			System.out.print(s.charAt(i));
			
		}
		
		System.out.println("=================== ");
		
		char ch[]= s.toCharArray();
		String rev="";
		for(char c:ch)
		{
			rev=c+rev;
		}
		
		System.out.println(rev);
	}
	

}
