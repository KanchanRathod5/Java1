package InterfaceSet;

import java.util.HashSet;
import java.util.Iterator;

public class settypes 
//HashSet class implements Set Interface. 
//It represents the collection that uses a hash table for storage.
//Hashing is used to store the elements in the HashSet. 
//It contains unique items.
{
	public static void main(String[] args)
	{
		//Creating HashSet and adding elements  
		HashSet<String> set=new HashSet<String>();  
		set.add("1000");  
		set.add("3000");  
		set.add("400");  
		set.add("300");  
		//Traversing elements  
		Iterator<String> itr=set.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());  

	}
}}