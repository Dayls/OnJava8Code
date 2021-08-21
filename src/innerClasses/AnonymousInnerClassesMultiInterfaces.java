package innerClasses;

interface B {}
interface C {}

class X implements B, C {}

class Y implements B {
	C makeC() {
		// anonymous inner class
		return new C() {
			
		};
	}
}
public class AnonymousInnerClassesMultiInterfaces {
	static void takesB(B b) {}
	static void takesC(C c) {}
	
	public static void main(String[] args) {
		X x = new X();
		Y y = new Y();
		takesB(x);
		takesB(y);
		
		takesC(x);
		takesC(y.makeC());
	}
}
