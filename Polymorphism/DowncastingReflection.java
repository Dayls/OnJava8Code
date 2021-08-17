class Useful {
	public void f() {}
	public void g() {}
}

class MoreUseful extends Useful {
	@Override public void f() {}
	@Override public void g() {}
	public void u() {}
	public void v() {}
	public void w() {}
}
public class DowncastingReflection {
	public static void main(String[] args) {
		Useful[] x = {
			new Useful(), 
			new MoreUseful()
		};
		x[0].f();
		x[1].g();
//		x[1].u();
		((MoreUseful)x[1]).u();	// Downacst/Reflect
		((MoreUseful)x[0]).u();	// exception thrown
	}
}
