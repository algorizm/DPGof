public class ShapeFactroy {
	
	public Shape getShape(ShapeEnum shapeType) {
		switch(shapeType){
		case Circle: return new Circle();
		case Rectangle: return new Rectangle();
		case Square: return new Square();
		default: return null;
		}
	}
}
