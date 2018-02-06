package sandbox;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*
 * 
    Set � Stored elements in unordered or shuffles way, and does not allow duplicate values.
    List � Stored elements in ordered way, and allow duplicate values.

 */

public class SetAndList {

	 public static void main( String[] args )
	    {
	    	System.out.println("List example .....");
	    	List<String> list = new ArrayList<String>();
	        list.add("1");
	        list.add("3");
	        list.add("2");
	        list.add("4");
	        list.add("1");

	        for (String temp : list){
	        	System.out.println(temp);
	        }

	        System.out.println("Set example .....");
	        Set<String> set = new HashSet<String>();
	        set.add("1");
	        set.add("3");
	        set.add("2");
	        set.add("4");
	        set.add("1");
	        set.add("11");
	        set.add("2");
	        set.add("5");

	        for (String temp : set){
	        	System.out.println(temp);
	        }
	    }
}
