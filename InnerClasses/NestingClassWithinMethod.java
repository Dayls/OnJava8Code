
public class NestingClassWithinMethod {
	NestingClassWithinMethod() {	// inner class inside a method can not be accessed anywhere except
									// an outer method
		class Inner {
			
		}
	}
	interface Inner {	// nesting class within interface and a control flow scope
		public class InsideInterface {	// it is also possible to make like this
			InsideInterface(){
				if(true) {
					final int TEN = 10;
					class HelloWorld {	// declaring class inside a control flow scope
						HelloWorld() {
							System.out.println("hello world!" + "\n" + TEN);	// possible to access local finals
						}
					}
				}
			}
		}
	}
}
