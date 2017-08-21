package generics;

class Pair<KeyType, ValueType> {
	  // Constructor
	  public Pair(KeyType aKey, ValueType aValue) {
	    key = aKey;
	    value = aValue;
	  }

	  // Get the key for this pair
	  public KeyType getKey() {
	    return key;
	  }

	  // Get the value for this pair
	  public ValueType getValue() {
	    return value;
	  }

	  // Set the value for this pair
	  public void setValue(ValueType aValue) {
	    value = aValue;
	  }

	  private KeyType key;

	  private ValueType value;
	}

	public class MainClass {

	  public static void main(String[] a) {
	    Pair<Integer, String> p = new Pair<Integer, String>(1, "A");

	    System.out.println(p.getKey());
	  }
	}