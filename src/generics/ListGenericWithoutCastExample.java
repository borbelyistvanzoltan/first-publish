package generics;

import java.util.ArrayList;
import java.util.List;

public class ListGenericWithoutCastExample {
	
	/*
	 * Code that uses generics has many benefits over non-generic code:
	 * - Elimination of casts
	 */
		
	public static void main(String args[]) throws Exception {
		
		/*
		 * The following code snippet without generics requires casting 
		 */
		
		List listWithoutUsingGenerics = new ArrayList();
		listWithoutUsingGenerics.add("hello");
		System.out.println("listWithoutUsingGenerics.get(0): " + listWithoutUsingGenerics.get(0));
		
		/*
		 * When re-written to use generics, the code does not require casting
		 */
		
		List<String> listWithUsingGenerics = new ArrayList<>();
		listWithUsingGenerics.add("wellhello");
		System.out.println("listWithUsingGenerics.get(0): " + listWithUsingGenerics.get(0));   // no cast
	}
	
//	String s2 = list2.get(0);   // no cast

}
