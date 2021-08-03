
public class BreakContinue {

	public static void main(String[] args) {
		for(int i = 0; i < 100; i++) {
			if (i == 74) break;
			if(i% 9 != 0) continue;
			System.out.print(i + " ");
		}
		System.out.println();
		// An infinite loop
		int i = 0;
		while (true) {
			i++;
			int j = i * 27;
			if(j == 1269) break; // out of loop
			if (i % 10 != 0) continue; // top of loop
			System.out.print(i + " ");
		}

	}

}
