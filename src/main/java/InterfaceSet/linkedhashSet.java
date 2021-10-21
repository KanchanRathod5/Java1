package InterfaceSet;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class linkedhashSet {
	//LinkedHashSet class represents the LinkedList 
	//implementation of Set Interface. 
	//It extends the HashSet class and implements Set interface.
	//Like HashSet, It also contains unique elements. 
	//It maintains the insertion order and permits null elements.
	public static void main(String args[]){  
		LinkedHashSet<String> set=new LinkedHashSet<String>();  
		set.add("hi");  
		set.add("hallow");  
		set.add("wonderfull");  
		set.add("hi");  
		Iterator<String> itr=set.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());  
		}  //output
		//hi
		//hallow
		//wonderfull
		}  

}
