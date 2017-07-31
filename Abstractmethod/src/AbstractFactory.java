public abstract class AbstractFactory {
	abstract Shape getShape(ShapeEnum shape);	
	abstract Color getColor(ColorEnum color);
}
