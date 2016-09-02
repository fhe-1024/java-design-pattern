package decoratorpattern;

public class DecoratorPatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape circle = new Circle();
		Shape redCircle=new RedShapeDecorator(new Circle());
		
		System.out.println("Circle with normal border");
		circle.draw();
		System.out.println("Circle with red border");
		redCircle.draw();
	}

}
