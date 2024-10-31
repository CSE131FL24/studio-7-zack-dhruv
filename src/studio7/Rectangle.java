package studio7;

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


}

