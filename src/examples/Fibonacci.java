package examples;

import java.io.IOException;
import java.lang.Exception;
import java.lang.StackOverflowError;

public class Fibonacci {
	
	static int[] c = { 1,2,3,4,5,6,7,8,9,10};
	
	public static int fiboMethod(int number){
			if (number == 0) {
					return 0;
			} else if (number == 1) {
					return 1;
			} else {
					return fiboMethod(number-1) + fiboMethod(number-2);
			}
	}
	
	public static void printArrayElements(int[] g) {
		for (int a : g) {
			System.out.println(a);
		}
	}
	
	public static void main(String[] args) {
		
		try {
		System.out.println("fiboMethod(0): " + fiboMethod(0));
		System.out.println("fiboMethod(1): " + fiboMethod(1));
		System.out.println("fiboMethod(5): " + fiboMethod(5));
		System.out.println("fiboMethod(5): " + fiboMethod(9));
		System.out.println("fiboMethod(5): " + fiboMethod(-5));
		} catch (StackOverflowError e){
			System.err.println("StackOverflowError: " + e.getMessage());
			
		} 
//		catch (IOException e){
//			System.err.println("Caught IOException: " + e.getMessage());
//		}
		
	
		
	printArrayElements(c);
		
	
	}
}
