class Game {
	Game(int i) {
		System.out.println("Animal constructor");
	}
}
class BoardGame extends Game {
	BoardGame (int a) {
		super(a);
		System.out.println("Turtle constructor");
	}
}
class Chess extends BoardGame {
	Chess () {
		super (10);
		System.out.println("MiniTurtle constructor");
	}
}
public class InheritanceConstructorsArgs {

}
