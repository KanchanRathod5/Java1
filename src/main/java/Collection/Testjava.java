package Collection;

import java.util.Iterator;
import java.util.Vector;

public class Testjava
{//Vector uses a dynamic array to store the data elements.
	//It is similar to ArrayList. However, 
	//However, It is synchronized and
	//contains many methods that are not the part of Collection framework.
	public static void main(String args[]){  
		Vector<String> v = new Vector<String>();  
		v.add("A");  
		v.add("b");  
		v.add("c");  
		v.add("d");  
		Iterator<String> itr=v.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next()); 
}
}}