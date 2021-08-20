interface Contents {
	int value();
}
public class AnonymousInnerClasses {
	public Contents contents() {
		return new Contents() {	// returns anonymous inner class that implements contents
			private int i = 11;
			@Override public int value() {
				return i;
			}
		};	// semicolon required
	}
	public static void main(String[] args) {
		AnonymousInnerClasses a = new AnonymousInnerClasses();
		Contents c = a.contents();
	}
}
