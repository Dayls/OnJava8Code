package controlFlow;
import java.util.Random;

public class For {

	public static void main(String[] args) {
		for(char c = 0; c < 128; c++) {
			if(Character.isUpperCase(c))	// detects if character is in lowercase
				System.out.println("value: " + (int)c + " character: " + c);
		}
		
		System.out.println();
		Comma.CommaOperator();
		System.out.println();
		In.ForIn();
		System.out.println();
		In.charIteration();
	}

}

class Comma {
	static void CommaOperator() {
		for (int i = 0, j = i + 10; i < 5; i ++, j = i * 2) {	// there must be one type of variables
			System.out.println("i = " + i + " j = " + j);
		}
	}
}

class In {
	static void ForIn () {
		Random rand = new Random(47);
		float[] f = new float[10];
		for (int i = 0; i < f.length; i ++)
			f[i] = rand.nextFloat();
		for (float x : f)	// for-in statement
			System.out.println(x);
	}
	
	static void charIteration() {
		for (char c : "An African Swallow".toCharArray())
			System.out.print(c + " ");
	}
}
