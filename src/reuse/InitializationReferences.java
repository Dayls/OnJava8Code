package reuse;
/*
 * There are 4 ways of initializing references:
 * 1. At point of definition
 * 2. In the constructor
 * 3. Right before using the object(lazy initialization)
 * 4. Instance initialization
 */
class Soap {
	private String s; 
	Soap () {
		System.out.println("Soap()");
		s = "Constructed";
	}
	@Override public String toString() { return s; }
}

class Bath {
	private String // initializing at point of definition
	s1 = "Happy",
	s2 = "Happy",
	s3, s4;
	private Soap castile;
	private int i;
	private float toy;
	public Bath () {	// initialization in the constructor
		System.out.println("Inside Bath()");
		s3 = "Joy";
		toy = 3.14f;
		castile = new Soap();
	}
	// instance initialization
	{ i = 47; }
	@Override public String toString() {
		if(s4 == null)
			s4 = "Joy";
		return
			"s1 = " + s1 + "\n" +
			"s2 = " + s2 + "\n" +
			"s3 = " + s3 + "\n" +
			"s4 = " + s4 + "\n" +
			"i = " + i + "\n" +
			"toy = " + toy + "\n" +
			"castile = " + castile;
	}
}
public class InitializationReferences {

	public static void main(String[] args) {
		Bath b = new Bath();
		System.out.println(b);

	}

}
