package ugralos_jatek;

public class UgralosTest {
	
	static int[] tomb={1,2,4,6};  // ok
	static int[] tomb1={1,0,4,6}; // hiba
	static int[] tomb2={1,1,4,0}; // ok
	static int[] tomb3={1,2,1,0}; // ok
	static int[] tomb4={3,2,1,0,4}; // false
	
	private static boolean trueOrFalse(int[] tomb) {
		int d = tomb.length;
				
		for (int s=0; s<tomb.length; s++) {
			if(d <= 0){
				return true;
			} else if (tomb[s]==0) {
				return false;
			} else if (d > 0) {
				d = d - tomb[s];
				s=tomb[s]-1;
			} 
			
		}
		
		return false;
		
	}
	
	public static void main(String[] args) {
		System.out.println(trueOrFalse(tomb4));
    }
	

}
