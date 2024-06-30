package StringProgram;

import java.util.LinkedHashSet;

public class Demo {

	public static void main(String[] args) {

        String s="java";  

// LinkedHashSet<Character> set = new LinkedHashSet<Character>();
LinkedHashSet<Character> set = new LinkedHashSet<Character>();
for(int i=0;i<s.length();i++)
{
	set.add(s.charAt(i));
}

for(char c:set)
{
	System.out.println(c);
}

	}

}
