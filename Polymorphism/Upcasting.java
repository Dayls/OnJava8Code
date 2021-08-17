class Fruit {
	private boolean isEaten = false;
	private boolean isRotten = false;
	Fruit(){
		System.out.println("fruit constructor!");
	}
	public boolean eaten() {
		return isEaten;
	}
	public void eat() {
		isEaten = true;
	}
	public boolean rotten() {
		return isRotten;
	}
	public void rot(Fruit fruit) {
		fruit.rot(fruit);
	}
}
class Orange extends Fruit {
	private boolean isRotten = false;
	Orange() {
		System.out.println("apple constructor!");
	}
	@Override
	public void rot(Fruit fruit) {
		System.out.println("I'm rotten!");
		isRotten = true;
	}
	public boolean rotten() {
		return isRotten;
	}
}
public class Upcasting {
	public static void main(String[] args) {
		Fruit base = new Orange();
	}
}