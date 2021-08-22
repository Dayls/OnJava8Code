package collections;
import java.util.*;

class Apple {
	private static long counter;
	private final long id = counter++;
	public long id() {
		return id;
	}
}

class Orange { }

public class ArrayListApplesWithoutGenerics {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		ArrayList apples = new ArrayList();
		for(int i = 0; i < 3; i++) {
			apples.add(new Apple());
		}
		apples.add(new Orange()); // no problems with this statement
		for(Object apple : apples) {
			((Apple) apple).id();
		}
	}
}

class ArrayListApplesWithGenerics {
	public static void main(String[] args) {
		ArrayList<Apple> apples = new ArrayList<>();	// specifying the type of objects in the ArrayList
													// possible to implement upcasting
		/* -------------------------------------------------
		 * different ways of declaring apples Collection using upcasting
		 * List<Apple> apples = new ArrayList<>();
		 * List<Apple> apples = new LinkedList<>();
		 */
	
		for(int i = 0; i < 3; i++) {
			apples.add(new Apple());
		}
//		apples.add(new Orange());	an error
		for(Apple apple : apples) {
			System.out.println(apple.id());
		}
	}
}
