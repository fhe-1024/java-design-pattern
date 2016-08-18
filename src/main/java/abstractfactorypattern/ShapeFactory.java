package abstractfactorypattern;

import abstractfactorypattern.color.Color;
import abstractfactorypattern.shape.Circle;
import abstractfactorypattern.shape.Rectangle;
import abstractfactorypattern.shape.Shape;
import abstractfactorypattern.shape.Square;

public class ShapeFactory extends AbstractFactory {

	@Override
	Shape getShape(String shapeType) {
		// TODO Auto-generated method stub
		if ("circle".equalsIgnoreCase(shapeType)) {
			return new Circle();
		} else if ("rectangle".equalsIgnoreCase(shapeType)) {
			return new Rectangle();
		} else if ("square".equalsIgnoreCase(shapeType)) {
			return new Square();
		}
		return null;
	}

	@Override
	Color getColor(String colorType) {
		// TODO Auto-generated method stub
		return null;
	}

}
