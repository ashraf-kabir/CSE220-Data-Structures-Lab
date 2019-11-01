package task06;

public class Square {

	public double height, width;

	public Square() {

	}

	public void setHeight(double he) {
		height = he;
	}

	public double getHeight() {
		return height;
	}

	public void setWidth(double wi) {
		width = wi;
	}

	public double getWidth() {
		return width;
	}

	public double getArea() {
		return height * width;
	}

}
