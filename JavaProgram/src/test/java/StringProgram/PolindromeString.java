package StringProgram;

public class PolindromeString {
	
	
	public static void main(String[] args) {
		
	
	String s="DAD";
	
	String temp= s;
	char ch []= s.toCharArray();
	String rev ="";
	
	for(char c:ch)
	{
		rev=c+rev;
		
	}
	
	System.out.println(rev);
	System.out.println(temp);
	
	if(temp.equals(rev))
	{
		System.out.println("Polindrome String");
	}
	else
	{
		System.out.println("Not Polindrome String");
	}
	
	}
	

}
