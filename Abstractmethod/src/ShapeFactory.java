
public class ShapeFactory extends AbstractFactory {

	@Override
	Shape getShape(ShapeEnum shape) {
		switch(shape){
		case Circle: return new Circle();
		case Rectangle: return new Rectangle();
		case Square: return new Square();
		default: return null;
		}
	}

	@Override
	Color getColor(ColorEnum color) {
		return null;
	}
}
