package generics;

import java.util.Hashtable;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;
import java.util.Set;

public class HashtableExample {
	
	public static void main(String[] args) {
		 
		   Enumeration names;
		   String key = null;
		 
		   // Creating a Hashtable
		   Hashtable<String, String> hashtable = 
		              new Hashtable<>();
		   HashMap<Integer, String> hmap = new HashMap<>();
		 
		   // Adding Key and Value pairs to Hashtable
		   hashtable.put("Key1","Chaitanya");
		   hashtable.put("Key2","Ajeet");
		   hashtable.put("Key3","Peter");
		   hashtable.put("Key4","Ricky");
		   hashtable.put("Key5","Mona");
		 
		   names = hashtable.keys();
		   
	       System.out.println(names);

		   while(names.hasMoreElements()) {
		      key = (String) names.nextElement();
		      System.out.println("Key: " +key+ " & Value: " +
		      hashtable.get(key));
		   }
		   
		   hashtable.clear();
		   
		   if(key == null){
		       System.out.println("Semmi");
		   } else {
		       System.out.println("Valami: " + hashtable.get(key));
		   }
		   
		 }

}
