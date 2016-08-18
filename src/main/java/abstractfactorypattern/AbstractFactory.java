package abstractfactorypattern;

import abstractfactorypattern.color.Color;
import abstractfactorypattern.shape.Shape;

public abstract class AbstractFactory {
	abstract Shape getShape(String shapeType);

	abstract Color getColor(String colorType);
}
