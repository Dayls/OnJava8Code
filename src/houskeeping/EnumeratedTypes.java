package houskeeping;
enum Spiciness {
	NOT, MILD, MEDIUM, HOT, FLAMING
}
public class EnumeratedTypes {

	public static void main(String[] args) {
		Spiciness hot = Spiciness.HOT;
		System.out.println(hot);
		
		for(Spiciness s : Spiciness.values())
			System.out.println(s + ", ordinal " + s.ordinal());	// returns position of value in enum
		
		Buritto buritto = new Buritto(Spiciness.FLAMING);
	}

}

class Buritto {
	Spiciness degree;
	public Buritto(Spiciness degree) {
		this.degree = degree;
		describe();
	}
	
	public void describe() {
		System.out.print("The buritto is ");
		switch(degree) {
		case NOT: 
			System.out.println("not spicy at all");
			break;
		case MILD:
		case MEDIUM:
			System.out.println("a little hot.");
			break;
		case HOT:
		case FLAMING:
		default:
			System.out.println("maybe too hot");
			break;
		}
	}
}
