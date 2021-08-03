
class Tank {
	int level;
}

public class OperatorsWithObjects {

	public static void main(String[] args) {
		Tank t1 = new Tank();
		Tank t2 = new Tank();
		t1.level = 9;
		t2.level = 47;
		System.out.println("1. t1.level: " + t1.level + ", t2.level: " + t2.level);
		t1 = t2;	// aliasing objects
		System.out.println("2. t1.level: " + t1.level + ", t2.level: " + t2.level);
		t1.level = 27;
		System.out.println("3. t1.level: " + t1.level + ", t2.level: " + t2.level);
		// changing level value of object without aliasing
		t1.level = t2.level;
	}
}
