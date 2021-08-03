
public class OperatorsCasting {

	public static void main(String[] args) {
		// casting meaning - "casting into a mold"
		int i = 200;
		long lng = (long) i;
		lng = 1;	// widening, so cast is not required
		long lng2 = (long) 200;
		lng2 = 200;
		// narrowing conversion
		i =  (int) lng2;	// cast required
		
		
		CastingNumbers.truncateNumbers();
		System.out.println();
		CastingNumbers.roundNumbers();
	}

}

class CastingNumbers {
	static double above = 0.7, below = 0.4;
	static float fabove = 0.7f, fbelow = 0.4f;
	static void truncateNumbers() {
		System.out.println("(int) above: " + (int) above);
		System.out.println("(int) below: " + (int) below);
		System.out.println("(int) fabove: " + (int) fabove);
		System.out.println("(int) fbelow: " + (int) fbelow);
	}
	
	static void roundNumbers () {
		System.out.println(
				"Math.round(above): " + Math.round(above));
		System.out.println(
				"Math.round(below): " + Math.round(below));
		System.out.println(
				"Math.round(fabove): " + Math.round(fabove));
		System.out.println(
				"Math.round(fbelow): " + Math.round(fbelow));
	}
}
