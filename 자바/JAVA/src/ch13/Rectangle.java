package ch13;

public class Rectangle extends Shape{
	double width;
	double height;
	
	public Rectangle(double x, double y, double w, double h) {
		super(x, y);
		width = w;
		height = h;
	}
	
	@Override
	public void draw() {
		
	}
}
