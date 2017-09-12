package generics;

class Util {
    public static <K, V> boolean compare(APair<K, V> p1, APair<K, V> p2) {
        return p1.getKey().equals(p2.getKey()) &&
               p1.getValue().equals(p2.getValue());
    }
    
}

class APair<K, V> {

    private K key;
    private V value;

    public APair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public void setKey(K key) { this.key = key; }
    public void setValue(V value) { this.value = value; }
    public K getKey()   { return key; }
    public V getValue() { return value; }
}

public class GenericMethods {
	
	public static void main(String[] args) {
		
		APair<Integer, String> p1 = new APair<>(1, "apple");
		APair<Integer, String> p2 = new APair<>(2, "orange");
		boolean same = Util.<Integer, String>compare(p1, p2);
		
		System.out.println(same);
		
	}

}
