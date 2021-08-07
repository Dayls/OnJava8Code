
public class ThisKeywordSimple {
	int i = 0;
	ThisKeywordSimple increment() {
		i++;
		return this;
	}
	void print() {
		System.out.println("i = " + i);
	}
	public static void main(String[] args) {
		ThisKeywordSimple x = new ThisKeywordSimple();
		x.increment().increment().increment().increment().increment().print();

	}

}
