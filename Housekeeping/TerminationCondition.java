import onjava.*;

class Book {
	boolean checkedOut = false;
	Book(boolean checkOut) {
		checkedOut = checkOut;
	}
	
	void checkIn() {
		checkedOut = false;
	}
	@SuppressWarnings("deprecation")
	@Override public void finalize() {
		if(checkedOut)
			System.out.println("Error: checked out");
		// Normally, you'll also do this:
		// super.finalize(); // Call the base-class version
	}
}
public class TerminationCondition {

	public static void main(String[] args) {
		Book novel = new Book(true);
		// proper cleanup:
		novel.checkIn();
		// drop the reference, forget to cleanup:
		new Book(true);
		// force garbage collection and finalization:
		System.gc();
		new Nap(1); // one second delay

	}

}
