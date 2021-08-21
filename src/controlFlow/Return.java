package controlFlow;

public class Return {
	static int test(int testval, int target) {
		if ( testval > target )
			return +1;
		if (testval < target )
			return -1;
		return 0;
	}
	
	public static void main(String[] args) {
		System.out.println((test(5, 10)));
		System.out.println((test(10, 5)));
		System.out.println(test(0,0));

	}

}
