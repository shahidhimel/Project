package project1;

public class ComparableTriangle extends TriangleFromSimpleGeometricObject
implements Comparable<ComparableTriangle>
{
	public ComparableTriangle(double side1, double side2, double side3,double height, String color, boolean filled) {
		super(side1, side2, side3, color, filled);
}
	public int compareTo(ComparableTriangle o) {
		if (getArea() > o.getArea()) return 1;
		else if (getArea() < o.getArea()) return -1;
		else
		return 0;
	}
	public String toString() {
		return super.toString() + " Area: " + getArea();
}
}