package decoratorpattern;

public abstract class ShapeDecorator implements Shape {

	protected Shape decoratedShape;

	public ShapeDecorator(Shape decoratedShape) {
		super();
		this.decoratedShape = decoratedShape;
	}

	public void draw() {
		// TODO Auto-generated method stub
		decoratedShape.draw();
	}

}
