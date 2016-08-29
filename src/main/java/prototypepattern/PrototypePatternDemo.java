package prototypepattern;

public class PrototypePatternDemo {
	public static void main(String[] args) {
		try {
			ShapeCache.loadCache();
			Shape cloneShape = (Shape) ShapeCache.getShape("1");
			System.out.println("Shape:" + cloneShape.getType());

			Shape cloneShape2 = ShapeCache.getShape("2");
			System.out.println("Shape:" + cloneShape2.getType());

			Shape cloneShape3 = ShapeCache.getShape("3");
			System.out.println("SHape:" + cloneShape3.getType());
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
