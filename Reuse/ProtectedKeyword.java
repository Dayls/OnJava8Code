class Villain {
	private String name;
	protected void set(String nm) {
		name = nm;
	}
	Villain(String name) {
		this.name = name;
	}
	@Override public String toString() {
		return "I'm a Villain and my name is " + name;
	}
}
class Orc extends Villain {
	private int orcNumber;
	public Orc(String name, int number) {
		super(name);
		this.orcNumber = number;
	}
	public void change(String name, int number) {
		set(name);
		this.orcNumber = number;
	}
	@Override public String toString() {
		return "Orc " + orcNumber + ": " + super.toString();
	}
	public static void main(String[] args) {	// run from here
		Orc orc = new Orc("Limburger", 12);
		System.out.println(orc);
		orc.change("Bob", 19);
		System.out.println(orc);
	}
}
