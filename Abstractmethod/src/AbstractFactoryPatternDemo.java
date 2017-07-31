public class AbstractFactoryPatternDemo {
	public static void main(String[] args){
		
		//get shape factory
		AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");
		Shape circle = shapeFactory.getShape(ShapeEnum.Circle);
		circle.draw();
		Shape rectangle = shapeFactory.getShape(ShapeEnum.Rectangle);
		rectangle.draw();
		
		//get color factory
		AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");
		Color red = colorFactory.getColor(ColorEnum.Red);
		red.fill();
		Color green = colorFactory.getColor(ColorEnum.Green);
		green.fill();
	}
}
