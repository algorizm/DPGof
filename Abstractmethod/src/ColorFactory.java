public class ColorFactory extends AbstractFactory {
	
	@Override
	Shape getShape(ShapeEnum shape){
		return null;
	}
	
	@Override
	Color getColor(ColorEnum color){
		switch(color){
		case Red: return new RedColor();
		case Green: return new GreenColor();
		case Blue: return new BlueColor();
		default: return null;
		}
	}
	
}
