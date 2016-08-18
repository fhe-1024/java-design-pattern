package factorypattern;

public class FactoryPatternDemo {
	public static void main(String[] args) {
		ShapeFactory factory = new ShapeFactory();
		Shape circle = factory.getShapeFactory("circle");
		circle.draw();
		Shape rectangle = factory.getShapeFactory("rectangle");
		rectangle.draw();
		Shape square = factory.getShapeFactory("square");
		square.draw();
	}
}
