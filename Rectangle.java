package section5;

public class Rectangle extends Shape {
	public int width;
	public int height;
	
	public Rectangle(int w, int h) {
		super("Rectangle");
		width = w;
		height = h;
	}
	public String toString() {
		return "Rectangle : width is " + width + ", height is " + height;
	}
	public double computerArea() {
		return (double)width*height;
	}
	public double computerPerimeter() {
		return 2.0*(width + height);
	}
}
