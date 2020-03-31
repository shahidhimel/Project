package project1;

public class SimpleGeometricObject 
{
private String color = "Blue";
private boolean filled = true;
private java.util.Date dateCreated;

public SimpleGeometricObject() 
{
	dateCreated = new java.util.Date();
}
public SimpleGeometricObject(String color, boolean filled) 
{
	dateCreated = new java.util.Date();
	this.color = color;
	this.filled = filled;
}

public String getColor() 
{
	return color;
}

public void setColor(String color) 
{
	this.color = color;
}

public boolean isFilled() 
{
	return filled;
}

public void setFilled(boolean filled) 
{
	this.filled = filled;
}

public java.util.Date getDateCreated()
{
	return dateCreated;
}

public String toString() 
{
	return "\ncolor: " + color + " and filled: " + filled;
}
}
