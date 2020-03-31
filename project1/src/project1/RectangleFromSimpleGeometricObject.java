package project1;
import project1.ColorableObject.Colorable;

public class RectangleFromSimpleGeometricObject extends SimpleGeometricObject
implements Colorable
{
	private double width = 1;
	private double height = 1;
	
	public RectangleFromSimpleGeometricObject(double width, double height) {
		this.width = width;
		this.height = height;
	}
	public RectangleFromSimpleGeometricObject(double width, double height, String color, boolean filled) {
		this.width = width;
		this.height = height;
		setColor(color);
		setFilled(filled);
	}
	public double getWidth() 
	{
		return width;
	}
	public void setWidth(double width) 
	{
		this.width = width;
	}
	public double getHeight()
	{
		return height;
	}
	public void setHeight(double height) 
	{
		this.height = height;
	}
	public double getArea() 
	{
		return width * height;
	}
	public String howToColor() {
		return " Color inside of the Rectangle " + super.toString();
	}
}
