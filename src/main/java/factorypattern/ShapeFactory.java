package factorypattern;

public class ShapeFactory {
	public Shape getShapeFactory(String shape) {
		if ("circle".equalsIgnoreCase(shape)) {
			return new Circle();
		} else if ("rectangle".equalsIgnoreCase(shape)) {
			return new Rectangle();
		} else if ("square".equalsIgnoreCase(shape)) {
			return new Square();
		}
		return null;
	}
}
