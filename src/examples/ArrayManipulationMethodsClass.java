package examples;

public class ArrayManipulationMethodsClass {

	static int[] c = { 1,2,3,4,5,6,7,8,9,10};
		

	public static void printArrayElementsShortFor(int[] g) {
		for (int a : g) {
			System.out.println(a);
		}
	}
	
	public static void printArrayElementsLongFor(int[] g) {
		for (int a=0; a<=g.length; a++) {
			System.out.println(g);
		}
	}
	
	
	
	
}
