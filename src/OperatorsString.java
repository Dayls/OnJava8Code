
public class OperatorsString {

	public static void main(String[] args) {
		int x = 0, y = 1, z = 2;
		String s = "x, y, z";
		System.out.println(s + x + y + z);
		// Converts x to a String
		System.out.println(x + " " + s);
		s += "(summed) = ";	// concatenation operator
		System.out.println(s + (x + y + z));
		// Shorthand for Integer.toString():
		System.out.println("" + x);
		

	}

}
