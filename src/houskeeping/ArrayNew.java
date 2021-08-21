package houskeeping;
import java.util.*;
public class ArrayNew {
	public static void main(String [] args) {
		int a[];
		Random rand = new Random();
		a = new int[rand.nextInt(20)];
		System.out.println("Length of a = " + a.length);
		System.out.println(Arrays.toString(a));
	}
}
