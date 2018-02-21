package designpatterns.creational.factorypattern;

public class Rectangle implements Shape {

	private int length;
	private int breadth;
	
	public Rectangle(int length, int breadth){
		this.length = length;
		this.breadth = breadth;
	}
	
	public void draw() {
		System.out.println("********Drawing a Rectangle********");
	}

	public void area() {
		System.out.println("Area of rectangle is : "+length*breadth);		
	}

	public void showDimensions() {
		System.out.println("Length = "+ length +"\t Breadth = " + breadth);	
	}

}
