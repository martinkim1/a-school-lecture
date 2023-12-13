package ch13;

public abstract class Shape {
	protected double x, y;

	public Shape(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public void drawCenter() {
		System.out.println("(x, y) = "+ x + ", "+ y);
	}

	public abstract void draw();
}
