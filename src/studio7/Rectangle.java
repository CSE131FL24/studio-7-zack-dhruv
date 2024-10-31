package studio7;

<<<<<<< HEAD
class Rectangle {
	private int width;
	private int length;
	public Rectangle(int width, int length) { 
		this.width = width;
		this.length = length;	
	}
	public int getArea() { 
		return this.length * this.width;
	}
	public int getPerimeter() { 
		return 2*(this.length + this.width);
	}
	public boolean isSquare() {
		return (this.width == this.length);
	}


=======

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
	
	
>>>>>>> branch 'main' of https://github.com/CSE131FL24/studio-7-zack-dhruv
}

