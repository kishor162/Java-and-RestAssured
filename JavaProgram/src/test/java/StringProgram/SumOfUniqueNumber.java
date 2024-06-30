package StringProgram;
import java.util.HashSet;

public class SumOfUniqueNumber {

	
	public static void main(String[] args) {
		int s[]= {2,4,2,2,5};
		
		HashSet<Integer> set= new HashSet<Integer>();
		
		for(int i=0;i<s.length;i++)
		{
			set.add(s[i]);
		}
		
		int sum=0;
		for(int ch:set)
		{
			int count =0;
			for(int i=0;i<s.length;i++)
			{
				if(ch==s[i])
				{
					
					count++;
					
				}
			}
			
			if(count==1)
			{
				sum=sum+ch;
			}
			
		}
		System.out.println(sum);
	}
}
