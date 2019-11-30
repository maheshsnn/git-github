package Regular_expressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regularexpressions_class {
/**
 * [^abc] used for except abc
 * [^1-9] used for except numbers
 * \s  only spacces
 * \S Except spaces
 * \d only digits
 * \D except digits
 * \w only words
 * \W except words
 * . only characters
 * 
 * 
 * 	
 * @param args
 */
	public static void main(String[] args) {
		
Pattern pt=Pattern.compile("\\D");

Matcher m=pt.matcher("fghkjklasd 654563213564");
	int count =0;
	while(m.find())
	{
		count++;
		System.out.println(m.start()+"       "+m.end()+"            "+m.group());
	}
	
	}

}
