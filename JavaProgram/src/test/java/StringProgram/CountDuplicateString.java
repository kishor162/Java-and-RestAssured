package StringProgram;

import java.util.LinkedHashSet;

public class CountDuplicateString {
	
	public static void main(String[] args) {
		
		
		String s="India India is good country";
		
		String ss[] = s.split(" ");
		
		LinkedHashSet<String> set = new LinkedHashSet<String>();
		
		for(int i=0;i<ss.length;i++)
		{
			set.add(ss[i]);
		}
		
		for(String word :set)
		{
			int count=0;
			for(int i=0;i<ss.length;i++)
			{
				if(word.equals(ss[i]))
				{
					count++;
				}
			}
			
			System.out.println(word+ " "+count);
		}
		
	}

}
