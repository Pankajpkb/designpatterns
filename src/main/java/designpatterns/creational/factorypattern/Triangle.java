package designpatterns.creational.factorypattern;

public class Triangle implements Shape {

	private int base;
	private int height;

	public Triangle(int base, int height){
		this.base = base;
		this.height = height;
	}
	
	public void draw() {
		System.out.println("********Drawing a triangle********");
	}

	public void area() {
		System.out.println("Area of traingle is :" + (0.5 * base * height));
	}

	public void showDimensions() {
		System.out.println("Base = " + base + "\t Height = " + height);
	}

}
