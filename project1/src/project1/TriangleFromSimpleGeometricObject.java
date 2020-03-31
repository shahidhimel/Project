package project1;

public class TriangleFromSimpleGeometricObject extends SimpleGeometricObject
{
	private double side1 = 1;
	private double side2 = 1;
	private double side3 = 1;
	private double height = 1;
	
	public TriangleFromSimpleGeometricObject() 
	{
		
	}
	public TriangleFromSimpleGeometricObject(double side1, double side2, double side3, double height) {
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
		this.height = height;
	}
	public TriangleFromSimpleGeometricObject(double side1, double side2, double side3, String color, boolean filled) {
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
		setColor(color);
		setFilled(filled);
	}
	public double getSide1() {
		return side1;
	}
	public void setSide1(double side1) {
		this.side1 = side1;
	}
	public double getSide2() {
		return side2;
	}
	public void setSide2(double side2) {
		this.side2 = side2;
	}
	public double getSide3() {
		return side3;
	}
	public void setSide3(double side3) {
		this.side3 = side3;
	}
	public double getHeight() {
		double s;
		s = (side1+side2+side3);
		height = s / 2;
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getArea() {
		double area,s;
	    s = (side1+side2+side3) / 2;
	    area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
	    return area;
	}
	public double getPerimeter() {
		return (side1 + side2 + side3);
	}
	public String toString() {
		return super.toString()  + " and the side1 is " + getSide1() +
				" and the side2 is " + getSide2() + " and the base is " + getSide3();
	}
}
