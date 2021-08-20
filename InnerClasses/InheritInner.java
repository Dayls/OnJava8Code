// inheriting from inner class example
class WithInner {
	class Inner {
		
	}
}
public class InheritInner extends WithInner.Inner{
	InheritInner(WithInner wi) {
		wi.super();	// necessary
	}
	public static void main(String[] args) {
		WithInner wi = new WithInner();
		InheritInner ii = new InheritInner(wi);
	}
}
