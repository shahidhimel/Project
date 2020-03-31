package project1;

public class CastingDemo 
{
	public static void main(String[] args) 
	{
		Object (new CircleFromSimpleGeometricObject (1));
		Object (new RectangleFromSimpleGeometricObject(1, 1));
		Object (new TriangleFromSimpleGeometricObject(1,1,1,1));
	}
	public static void Object(Object x) 
	{
		if(x instanceof CircleFromSimpleGeometricObject) 
		{
			System.out.println("The circle area is " + 
			((CircleFromSimpleGeometricObject)x).getArea());
		}
		else if(x instanceof RectangleFromSimpleGeometricObject) 
		{
			System.out.println("The rectangle area is " +
			((RectangleFromSimpleGeometricObject)x).getArea());
		}
		else if(x instanceof TriangleFromSimpleGeometricObject) 
		{
			System.out.println("The Triangle area is " +
			((TriangleFromSimpleGeometricObject)x).getArea());
		}
		else
			System.out.println(x.toString());
	}
}
