package houskeeping;
import java.util.*;
public class ArrayClassObj {

	public static void main(String[] args) {
		Random rand = new Random(47);
		Integer a[] = new Integer[rand.nextInt(20)];
		System.out.println("Length of a = " + a.length);
		for(int i = 0; i < a.length ; i ++) {
			a[i] = rand.nextInt(500);
		}
		System.out.println(Arrays.toString(a));
		System.out.println();
		
		ArrayInit obj1 = new ArrayInit();
		obj1.main();
	}

}

class ArrayInit {
	public static void main () { 
		Integer a[] = {
				1, 2, 
				3, // Autoboxing
		};
		Integer b[] = new Integer [] {
				1, 2,
				3, // Autoboxing
		};
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
	}
}
