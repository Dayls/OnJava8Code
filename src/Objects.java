import java.io.*;
import java.lang.NumberFormatException;
import java.util.Scanner;

public class Objects {

	public static void main(String[] args) throws IOException {
		// Reading input from console using BufferedReader
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		// Reading input from console using Scanner
		Scanner scanner = new Scanner(System.in);
		
		String buff_read = reader.readLine();
		String scan_read = scanner.nextLine();
		scanner.close();
		int buff_int = 0;
		int scan_int = 0;
		try {	// catching exception
				// it is better to parse both integers in the different try blocks
				// to prevent nulling both values if only one can not be parsed
			buff_int = Integer.parseInt(buff_read);	// converting strings to integers
			scan_int = Integer.parseInt(scan_read);
		} catch (NumberFormatException e) {
			System.out.println("An error occured!");
//			e.printStackTrace(); // throwing exception in the console
		}
		
		System.out.println(buff_read);
		System.out.println(scan_read);
		System.out.println(buff_int);
		System.out.println(scan_int);
	}

}
