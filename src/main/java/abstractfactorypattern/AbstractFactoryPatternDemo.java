package abstractfactorypattern;

public class AbstractFactoryPatternDemo {
	public static void main(String[] args) {
		AbstractFactory shapeFactory = FactoryProducer.getFactory("shape");
		shapeFactory.getShape("circle").draw();

		AbstractFactory colorFactory = FactoryProducer.getFactory("color");
		colorFactory.getColor("blue").fill();

	}
}
