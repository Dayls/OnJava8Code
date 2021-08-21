package controlFlow;

public class While {
	static boolean condition() {
		boolean result = Math.random() < 0.99;
		System.out.println("result: " + result);
		return result;
	}
	
	public static void main(String[] args) {
		while(condition())
			System.out.println("Iside 'while'");
		System.out.println("Exited 'while'");

	}
	
	static void DoWhile() {
		do
			System.out.println("Done!");	// executed once
		while(false);
	}

}
