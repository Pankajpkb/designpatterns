package designpatterns.creational.factorypattern;

public class FactoryPatternDemo {

	public static void main(String[] args) {
		Shape rect = ShapeFactory.getRectangle(15, 10);
		Shape circle = ShapeFactory.getCircle(5.5);
		Shape triangle = ShapeFactory.getTriangle(12, 5);

		rect.draw();rect.area();rect.showDimensions();
		circle.draw();circle.area();circle.showDimensions();
		triangle.draw();triangle.area();triangle.showDimensions();
	}
}
