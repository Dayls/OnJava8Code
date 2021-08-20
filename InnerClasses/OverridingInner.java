class Car {
	private Wheel w;
	Car(){
		System.out.println("Car constructor");
		foo();	// overriding method
		w = new Wheel();	// overriding inner class (not working)
	}
	void foo() {
		System.out.println("Car.foo()");
	}
	protected class Wheel {
		public Wheel(){
			System.out.println("Car.Wheel()");
		}
	}
}

class Bus extends Car {
	Bus(){
		System.out.println("Bus constructor");
	}
	@Override void foo() {
		System.out.println("Bus.foo()");
	}
	public class Wheel {	// inner class can not be overriden
		public Wheel() {
			System.out.println("Bus.Wheel()");
		}
	}
}

public class OverridingInner {
	public static void main(String[] args) {
		new Bus();
	}
}
