// testing protected access modifier
public class ProtectedTest {

	public static void main(String[] args) {
		Animal animal = new Animal();	// what is the difference ?
		Turtle turtle;
		animal.eat();
		turtle = new Turtle();

	}

}

class Animal {
	public void eat() {
		System.out.println("I ate!");
	}
	void poo() {
		
	}

}

class Turtle extends Animal {
	Turtle() {
		eat();
	}
	protected void swim () {
		System.out.println("I swam!");
	}
	protected void crawl () {
		
	}
}


