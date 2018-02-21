package designpatterns.creational.factorypattern;

public class Circle implements Shape {

	private double radius;
	
	public Circle(double radius){
		this.radius = radius;
	}

	public void draw() {
		System.out.println("********Drawing a Circle********");
	}

	public void area() {
		System.out.println("Area of circle is : " + (Math.PI * Math.pow(radius, 2.0)));
	}

	public void showDimensions() {
		System.out.println("Radius of the circle is : " + radius);
	}

}
