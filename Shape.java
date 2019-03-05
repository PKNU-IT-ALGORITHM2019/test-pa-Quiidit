package section5;

public abstract class Shape {
	public String ShapeName;
	
	public Shape(String name) {
		ShapeName = name;
	}
	public abstract double computerArea();
	public abstract double computerPerimeter();
}
