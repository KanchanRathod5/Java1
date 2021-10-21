package String;

import java.security.DomainCombiner;

public class String_Exmp 
{
	
		//The Java String is immutable which means
		//it cannot be changed. Whenever we change any string, a new instance is created. For mutable strings, 
		//you can use StringBuffer and StringBuilder classes.
	
//String class provides a lot of methods to perform operations on 
	//strings such as compare(), concat(), equals(), split(), length(), 
	//replace(), compareTo(), intern(), substring() etc.
	char[] ch={'j','a','v','a','t','p','o','i','n','t'};  
	String s=new String(ch); // object cretion using new keyword 
	public static void main(String[] args) {
		
		String s ="hallo";   //object of string using string literal.
	    String s1 = "hi";
   System.out.println(s);
   System.out.println(s1);  //s and s1 stored in string constant pool 
	
}
}