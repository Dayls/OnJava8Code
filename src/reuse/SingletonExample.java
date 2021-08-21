package reuse;
class Soup1 {
	private Soup1() {}
	public static Soup1 makeSoup() {
		return new Soup1();
	}
}

class Soup2 {
	private Soup2() {}
	private static Soup2 ps1 = new Soup2();
	public static Soup2 access() {	// singleton design pattern(allows to access a single object)
		return ps1;
	}
	public void f() {}
}

class Lunch {
	void testPrivate () {
		// Soup1 soup = new Soup1();
	}
	void testStatic() {
		Soup1 soup = Soup1.makeSoup();
	}
	void testSingleton() {	// creating an object of singleton pattern
		Soup2.access().f();
	}
}
public class SingletonExample {

	public static void main(String[] args) {

	}

}
