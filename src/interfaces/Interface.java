package interfaces;
interface Concept {
	void idea1();
	void idea2();
}
class Implementation implements Concept {
	@Override public void idea1() {	// implemented methods must be public
		System.out.println("idea1");
	}
	@Override public void idea2() {
		System.out.println("idea2");
	}
	
}

interface AnInterface {
	void oldMethod();
	default void newMethod() {	// it is not necessary to implement default method because it is automatically implemented in derived classes
								// default methods are needed to add new methods to interface without breaking all code from derived classes
		System.out.println("newMethod");
	}
}
class AnImplementation implements AnInterface{
	@Override public void oldMethod() {
		System.out.println("oldMethod");
	}
	public static void main(String[] args) {
		AnInterface i = new AnImplementation();
		i.oldMethod();
		i.newMethod(); // calling automatically implemented method
	}
}

interface One {
	default void one() {
		System.out.println("One");
	}
}

class ImplementationOfAll implements Concept, AnInterface, One {
	@Override public void idea1() {
		
	}
	@Override public void idea2() {
		
	}
	@Override public void oldMethod() {
		
	}
	ImplementationOfAll() {
		// it is possible to implement many default behaviors
		one();
		newMethod();
		
		oldMethod();
	}
}
