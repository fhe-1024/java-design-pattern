package abstractfactorypattern;

import abstractfactorypattern.color.Blue;
import abstractfactorypattern.color.Color;
import abstractfactorypattern.color.Green;
import abstractfactorypattern.color.Red;
import abstractfactorypattern.shape.Shape;

public class ColorFactory extends AbstractFactory {

	@Override
	Color getColor(String colorType) {
		// TODO Auto-generated method stub
		if ("blue".equalsIgnoreCase(colorType)) {
			return new Blue();
		} else if ("green".equalsIgnoreCase(colorType)) {
			return new Green();
		} else if ("red".equalsIgnoreCase(colorType)) {
			return new Red();
		}
		return null;
	}

	@Override
	Shape getShape(String shapeType) {
		// TODO Auto-generated method stub
		return null;
	}

}
