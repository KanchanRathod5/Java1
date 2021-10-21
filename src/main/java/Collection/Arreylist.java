package Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class Arreylist 
{
//The ArrayList class implements the List interface. 
	//It uses a dynamic array to store the duplicate element of different data types. 
	//The ArrayList class maintains the insertion order and is non-synchronized
	public static void main(String[] args) {
		
		ArrayList<String> list=new ArrayList<String>();//Creating arraylist  
		list.add("kanchan");//Adding object in arraylist  
		list.add("shital");  
		list.add("kiran");  
		list.add("varsha");  
		//Traversing list through Iterator  
		Iterator itr=list.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());  
		}  
		}  

	}


