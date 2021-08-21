package innerClasses;

class Outer {
	private static Inner inner = new Inner();
	private int outerInt = 111;
	public static class Inner {	// static inner class is the one that doesn't have implicit link to the outer class
								// so there may be many different references to an inner static class 
								// it is called nested class
		
								//  In effect, a static nested class is behaviorally a top-level class that has
								//	been nested in another top-level class for packaging convenience.
								// DEPRECATED since java 16
		public static int i = 10;
		public void chageI() {
			i++;
		}
		public void printI() {
			System.out.println(i);
		}
	}
	
	public class Inner2 {	// what ?!
		static int i = 1;
		static void hello() {
			System.out.println("helo");
		}
	}
	
	Inner returnInner() {
		return inner;
	}
}

class Outer2 {
	public class Inner {
		class Inner2 {
			public String hey = "hey";
			class Inner3 {
				class Inner4 {
					class Inner5 {
						class Inner6 {
							class Inner7 { 
								class Inner8 {
									class Inner9 {
										class Inner10 {
											static String hello = "hello!";
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}
}

class DotThis {
	void f() {
		System.out.println("DotThis.f()");
	}
	public class Inner {
		public DotThis outer() {
			return DotThis.this;	// returns an outer class
		}
	}
	public Inner inner() {
		return new Inner();
	}
}

public class NestedClasses {
	public static void main(String[] args) {
		Outer o = new Outer();
		Outer.Inner inner = new Outer.Inner();
//		Outer2.Inner a = new Outer2.Inner();	// illegal. Not possible to create a reference to non-static inner inside a static class

		Outer.Inner inner2 = o.returnInner();
		inner.printI();
		
		inner2.chageI();
		inner.printI();
		inner2.printI();
		
		Outer2 outer = new Outer2();
		Outer2.Inner inner3 = outer.new Inner();	// must use instance of the outer class to create an instance of the inner class
													// because object of an inner class implicitly connected to its outer class
		System.out.println(Outer2.Inner.Inner2.Inner3.Inner4.Inner5.Inner6.Inner7.Inner8.Inner9.Inner10.hello);
		
		DotThis dt = new DotThis();
		DotThis.Inner dtInner = dt.inner();
		dtInner.outer().f();
	}
}
