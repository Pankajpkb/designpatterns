package designpatterns.creational.factorypattern;

public abstract class ShapeFactory {

	public static Shape getRectangle(int length, int breadth){
		return new Rectangle(length,breadth);
	}
	public static Shape getCircle(double radius){
		return new Circle(radius);
	}
	public static Shape getTriangle(int base, int height){
		return new Triangle(base,height);
	}
	
}
