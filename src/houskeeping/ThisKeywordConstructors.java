package houskeeping;

public class ThisKeywordConstructors {
	int petalCount = 0;
	String s = "initial value";
	ThisKeywordConstructors(int petals) {
		petalCount = petals;
		System.out.println(
				"Constructor w/ int arg only, petalCount = "
				+ petalCount);
	}
	ThisKeywordConstructors(String ss){
		System.out.println(
				"Constructor w/ String arg only, s = "
				+ ss);
	}
	ThisKeywordConstructors(String s, int petals) {
		this(petals);
		this.s = s;
		System.out.println("String & int args");
	}
	ThisKeywordConstructors() {
		this("hi", 47);
	}
	void printPetalCount() {
		System.out.println("Petal count = " + petalCount + ", s = " + s);
	}
	public static void main(String[] args){
		ThisKeywordConstructors x = new ThisKeywordConstructors();
		x.printPetalCount();

	}

}
