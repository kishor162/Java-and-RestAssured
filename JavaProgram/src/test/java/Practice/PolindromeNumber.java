package Practice;

public class PolindromeNumber {

	public static void main(String[] args) {
		int x=989;
		
		int temp=x;
		int rev=0;
		while(x>0)
		{
			int rem = x%10;
			 rev = rev*10+rem;
			 x=x/10;
			 
			
		}
		System.out.println(rev);
		if(rev==temp)
		{
			System.out.println("polindrome Number");
		}
		else
		{
			System.out.println("Not a polindrome Number");
		}
	}
}
