package bridgepattern;

public class BridgePatternDemo {
	public static void main(String[] args) {
		Shape redCircle = new Circle(1, 2, 3, new RedCircle());
		redCircle.draw();
	}
}
