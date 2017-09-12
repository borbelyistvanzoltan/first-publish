package generics;

public class BoundedTypeParametersNaturalNumber {
	
	class NaturalNumber<T extends Integer> {

	    private T n;

	    public NaturalNumber(T n)  { this.n = n; }

	    public boolean isEven() {
	        return n.intValue() % 2 == 0;
	    }

	    // ...
	}
	
	public static void main(String args){
		
		NaturalNumber<> integerNaturalNumber = new NaturalNumber<>();
		
	}

}
