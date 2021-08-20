
public class Creating2 {	// an outer class has a method that returns a
							// reference to an inner class as seen in to() and contents()
	class Contents {
		private int i = 11;
		public int value() {
			return i;
		}
	}
	class Destination {
		private String label;
		Destination(String whereTo){
			label = whereTo;
		}
		String readLabel() {
			return label;
		}
	}
	public Destination to(String s) {
		return new Destination(s);
	}
	public Contents contents() {
		return new Contents();
	}
	public void ship(String dest) {
		Contents c = contents();
		Destination d = to(dest);
		System.out.println(d.readLabel());
	}
	public static void main(String[] args) {
		Creating2 c = new Creating2();
		c.ship("Tasmania");
		Creating2 d = new Creating2();
		// defining references to inner classes
		Creating2.Contents e = d.contents();
		Creating2.Destination f = d.to("Borneo");
	}
}
