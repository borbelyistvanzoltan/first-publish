package examples;

/*
 * @project: change two number without using a third variable
 */

public class ChangeTwoNumbers {
	
	public static void main(String[] args) {
		int a = 3;
		int b = 5;
		
		System.out.println("Original values: a = " + a + ", b = " + b);
		
		a = a + b;
		b = a - b;
		a = a - b;
		
		System.out.println("Modified values: a = " + a + ", b = " + b);
    }

}
