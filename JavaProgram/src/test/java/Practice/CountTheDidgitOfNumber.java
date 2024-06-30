package Practice;

public class CountTheDidgitOfNumber {
	public static void main(String[] args) {
		int x=3456;
		int count=0;
		while(x>0)
		{
			x=x/10;
			
			count++;
			System.out.print(count);
					
		}
	}

}
