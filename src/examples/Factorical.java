package examples;

import java.lang.StackOverflowError;

public class Factorical {
	
	
	public static int factMethod(int number){
			if ((number == 0) || (number == 1)) {
					return 1;
			} else {
					return number * factMethod(number-1);
			}
	}
	
	
	public static void main(String[] args) {
		
		try {
		System.out.println("factMethod(4): " + factMethod(4));
		System.out.println("factMethod(-4): " + factMethod(-4));
		System.out.println("factMethod(5): " + factMethod(5));
		} catch (StackOverflowError e){
			System.err.println("StackOverflowError: " + e.getMessage());
			
		}
	}
}
