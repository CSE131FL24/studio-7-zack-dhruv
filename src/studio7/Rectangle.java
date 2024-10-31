package studio7;


public class Rectangle {
	private int length;
	private int width;
	
	public Rectangle(int length, int width) {
		this.length = length;
		this.width = width;
	}
	
	public int getArea() {
		return this.length * this.width;
	}
	
	public int getPerimeter() {
		return this.length * 2 + this.width*2;
	}
	
	public boolean isSquare() {
		return this.length == this.width;
	}
	
	
}

