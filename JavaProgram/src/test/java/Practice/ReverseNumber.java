package Practice;

public class ReverseNumber {
	
	public static void main(String[] args) {
		int n=8769, rev=0;
		while(n>0)
		{
			int rem = n%10;
			 rev =rev*10+rem;
			 n=n/10;
		}
		
		System.out.println(rev);
	}

}
