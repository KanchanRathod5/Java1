package Collection;

import java.security.DomainCombiner;
import java.util.Iterator;
import java.util.LinkedList;

public class linkedlist
{
	public static void main(String args []) {
	//LinkedList implements the Collection interface. 
	//It uses a doubly linked list internally to store the elements. 
	//It can store the duplicate elements. 
	//It maintains the insertion order and is not synchronized. 
	//In LinkedList the manipulation is fast because no shifting is required.

	LinkedList<String> al=new LinkedList<String>();  
	al.add("k");  
	al.add("a");  
	al.add("n");  
	al.add("c");  
	Iterator<String> itr=al.iterator();  
	while(itr.hasNext()){  
	System.out.println(itr.next());  
	}  
	
}}

