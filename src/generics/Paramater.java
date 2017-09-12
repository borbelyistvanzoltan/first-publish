package generics;

class BoxWithoutGeneric {
	private Object object;

	public void set(Object object) {
		this.object = object;
	}

	public Object get() {
		return object;
	}
}

/**
 * Generic version of the Box class.
 * 
 * @param <T>
 *            the type of the value being boxed
 */
class BoxWithGeneric<T> {
	// T stands for "Type"
	private T t;

	public void set(T t) {
		this.t = t;
	}

	public T get() {
		return t;
	}
}

interface SomeInterface<K, V> {
	public K getKey();

	public V getValue();
}

class OrderedPair<K, V> implements SomeInterface<K, V> {

	private K key;
	private V value;

	public OrderedPair(K key, V value) {
		this.key = key;
		this.value = value;
	}

	public K getKey() {
		return key;
	}

	public V getValue() {
		return value;
	}
}

public class Paramater {

	public static void main(String[] args) {

		BoxWithGeneric<Integer> integerBoxWithGeneric = new BoxWithGeneric<>();
		BoxWithGeneric<String> stringBoxWithGeneric = new BoxWithGeneric<>();
		BoxWithGeneric<Boolean> booleanBoxWithGeneric = new BoxWithGeneric<>();

		integerBoxWithGeneric.set(10);
		System.out.println(integerBoxWithGeneric.get());

		OrderedPair<Integer, String> p1 = new OrderedPair<>(2, "valami");
		OrderedPair<String, String> p2 = new OrderedPair<>("hello", "world");
		OrderedPair<Integer, Integer> p3 = new OrderedPair<>(2, 3);

		System.out.println(p1.getKey());
		System.out.println("p3.getValue(): " + p3.getValue());

		OrderedPair<String, BoxWithGeneric<Integer>> p = new OrderedPair<>("primes", integerBoxWithGeneric);

		System.out.println(p.getValue().get());

		// Create a Raw type generic class
		// A raw type is the name of a generic class or interface without any
		// type arguments
		BoxWithGeneric rawbox = new BoxWithGeneric();
		System.out.println("rawbox.get(): " + rawbox.get());
		
		rawbox.set(p3);
		System.out.println("rawbox.get(): " + rawbox.get());
		
		System.out.println("rawbox.get().toString(): " + rawbox.get().toString());
		
		rawbox.equals(p3);
		
		System.out.println("rawbox: " + rawbox);
		
		/*
		 * This piece of code maybe makes warning.
		 */
		BoxWithGeneric<String> stringBox = new BoxWithGeneric<>();
		BoxWithGeneric rawStringBox = stringBox;
		rawStringBox.set(8);
		
		System.out.println("rawStringBox.get(): " + rawStringBox.get());

	}
}
