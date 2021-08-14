
public class ArrayOverLoadingVarArgs {
	static void f(Character... args) {
		System.out.println("First");
		for(Character c : args)
			System.out.print(c + " ");
		System.out.println();
	}
	static void f(Integer... args) {
		System.out.println("Second");
		for(Integer i : args)
			System.out.println(i + " ");
		System.out.println();
	}
	static void f(Long... args) {
		System.out.println("Third");
		for(Long l : args)
			System.out.print(l + " ");
		System.out.println();
	}
	public static void main(String[] args) {
		f('a', 'b', 'c');
		f(1);
		f(2, 1);
		f(0);
		f(0l);
		// f(); ambiguous
	}

}

class OverLoadingVarArgs2{
	static void f(float i, Character... args) {
		System.out.println("first");
	}
	static void f(char c, Character... args) {
		System.out.println("second");
	}
	public static void main(String[] args) {
		f(1, 'a');
		f('a', 'b');
	}
}
