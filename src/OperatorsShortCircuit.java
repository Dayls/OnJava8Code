
public class OperatorsShortCircuit {

	static boolean test1(int val) {
		System.out.println("test1(" + val + ")");
		System.out.println("result: " + (val < 1));
		return val < 1;
	}
	static boolean test2(int val) {
		System.out.println("test2(" + val + ")");
		System.out.println("result: " + (val < 2));
		return val < 2;
	}
	static boolean test3(int val) {
		System.out.println("test2(" + val + ")");
		System.out.println("result: " + (val < 3));
		return val < 3;
	}
	public static void main(String[] args) {
		boolean b = test1(0) && test2(2) && test3(3);
		System.out.println("expression is " + b);	// test3 hasn't been called because
													// the first two conditions were already false
													// it is faster to not check all conditions
	}

}
