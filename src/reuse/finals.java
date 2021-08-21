package reuse;

public class finals {
	private final int i = 0;
	private final int j;
	finals() {
		j = 10;	// must be initialized in constructor
	}
	public static void main(String[] args) {
//		b = 11;
	}
}

final class finalArgs {
	void changeArg(final finals i) {
//		i = new finals(); Illegal
	}
}
//class test extends finalArgs { Illegal
//
//}


class finalMethod {
	final void overrideMe() {
		System.out.println("hello");
	}
	
	private void overrideMeToo() {
		System.out.println("hi");
	}
}

class test extends finalMethod {
//	@Override 	// illegal
//	void overrideMe() {
//		
//	}
	
//	@Override	// illegal
//	private void overrideMeToo() {
//		System.out.println("goodbye");
//	}
}

final class FinalClass {
	// can not be inherited by other classes
	void f(int i) {
		// all methods of final class are final
	}
}


