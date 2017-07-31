
public class FactoryPatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ShapeFactroy shapeFactory = new ShapeFactroy();
		
		Shape shape1 = shapeFactory.getShape(ShapeEnum.Circle);
		shape1.draw();
		
		Shape shape2 = shapeFactory.getShape(ShapeEnum.Rectangle);
		shape2.draw();
		
		Shape shape3 = shapeFactory.getShape(ShapeEnum.Square);
		shape3.draw();
	}

}
