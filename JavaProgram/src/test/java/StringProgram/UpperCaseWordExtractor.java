package StringProgram;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UpperCaseWordExtractor {
	
	public static void main(String[] args) {
		
		
		String input="This is A String With UPPERCASE WORDS";
		
		
		Pattern pattern = Pattern.compile("\\b[A-Z]+\\b");
		Matcher matcher = pattern.matcher(input);
		
		while(matcher.find())
		{
			System.out.println(matcher.group());
			
		}
		
		
	}

}
