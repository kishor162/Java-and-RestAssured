package Practice;

public class PrimeNumber {
	
	public static void main(String[] args) {
		int n=8,i=1,count=0;
		
		while(i<=n)
		{
			if(n%i==0){
			count++;
			
			
			}
			i++;
		}
		
		if(count==2)
		{
			System.out.println("prime number");
		}
		else
		{
			System.out.println(" not prime number");
		}
	}

}
