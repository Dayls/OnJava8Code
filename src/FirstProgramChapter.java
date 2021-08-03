
import java.util.*;
public class FirstProgramChapter {

	public static void main(String[] args) {
		System.out.println("Hello, it's: ");
		System.out.println(new Date());	// Date object that created only to send a value
										// this object automatically converts to the string
//		System.getProperties().list(System.out); 	// this line prints enviroment information
													// the list property sends the result to its argument
		System.out.println(System.getProperty("user.name"));	// asking for specific enviroment property
		System.out.println(
				System.getProperty("java.library.path"));
	}

}
