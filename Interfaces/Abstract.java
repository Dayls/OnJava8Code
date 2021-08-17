abstract class Basic {	// classes with abstract methods must be abstract
	abstract void unimplemented();
}

public class Abstract {
	public static void main(String[] args) {
		// Basic b = new Basic(); basic cannot be initialized because it is abstract
		
	}
}

abstract class Basic2 extends Basic {
	int f() { return 111; }
	abstract void g();
	// unimplemented() is not implemented
//	private abstract void h();	abstract methods can't be private
}

abstract class Basic3 {
	int f() { return 111; }
	// it is not necessary to declare abstract methods in the abstract class
	// if it is needed to just not initialize that class
}

class Basic4 extends Basic {
	void unimplemented() {	// classes derived from abstract classes must implement their interface
		
	}
}

class AbstractWithoutAbstracts {
//	Basic b3 = new Basic();	Basic3 can not be initialized
}
