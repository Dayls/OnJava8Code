package innerClasses;
// Why to use inner classes?
// Each inner class can independently inherit from an implementation. Thus,
// the inner class is not limited by whether the outer class is already
// inheriting from an implementation.

// That is, inner classes effectively allow you to inherit from more than one non-interface

public class Creating {
	class Contents extends Creating {
		private int i = 11;
		public int value() {
			return i;
		}
	}
	class Destination {
		private String label;
		Destination(String whereTo) {
			label = whereTo;
		}
		String readLabel() {
			return label;
		}
	}
	// using inner classes looks just like using any other classes within outer
	public void ship(String dest) {
		Contents c = new Contents();
		Destination d = new Destination(dest);
		System.out.println(d.readLabel());
	}
	public static void main(String[] args) {
		Creating c = new Creating();
		c.ship("Tasmania");
	}
}

