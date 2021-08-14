class A {}

public class ArrayVarArgs {
	static void printArray(Object arr[]) {
		for(Object obj : arr)
			System.out.print(obj + " ");
		System.out.println();
	}
	public static void main(String[] args) {
		printArray(new Object[] { 47, (float) 3.14, 11.11 });
		printArray(new Object[] {"one", "two", "three"});
		printArray(new Object[] { new A(), new A(), new A() });

	}

}

class newVarArgs {
	static void printArray(Object... args) {	// vararg
		for(Object obj : args)
			System.out.print(obj + " ");
		System.out.println();
	}
	
	public static void main(String[] args) {
		// individual elements
		printArray(47, (float) 3.14, 11.11);
		printArray(47, 3.14F, 11.11);
		printArray("one", "two", "three");
		printArray(new A(), new A(), new A());
		// array
		printArray((Object[])new Integer[]{ 1, 2, 3, 4 });
		printArray();
	}
}

class OptionalTrailingArguments {
	static void f(int required, String... trailing) {	// ... - optional argument (list, or one object, or zero)
		System.out.println("required = " + required);
		for(String s : trailing)
			System.out.print(s + " ");
		System.out.println();
	}
	public static void main(String[] args) {
		f(10, "hello", "world");
		f(100, "bye");
		f(0);	// string argument is optional in this case
	}
}

class VarargType {
	static void f(Character... args) {
		System.out.println(args.getClass());
		System.out.println("length of args = " + args.length);
	}
	static void g(int... args) {
		System.out.println(args.getClass());
		System.out.println("length of args = " + args.length);
	}
	public static void main(String[] args) {
		f('a', 'b', 'c');
		f();
		g(1);
		g();
		System.out.println("int[] = " + 
		new int[0].getClass());
	}
}

class AutoboxingVarArgs {
	public static void f(Integer... args) {
		for (Integer i : args)
			System.out.print(i + " ");
		System.out.println();
	}
	public static void main(String[] args) {
		f(1, 2);
		f(4, 5, 6);
		f();
	}
}
