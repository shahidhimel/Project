package project1;

public class Project4 
{
	public static void main(String[] args) 
	{
		
		RectangleFromSimpleGeometricObject[] Colorable = 
			{	new RectangleFromSimpleGeometricObject(1,6),
				new RectangleFromSimpleGeometricObject(1,4),
			 	new RectangleFromSimpleGeometricObject(4,2),
				new RectangleFromSimpleGeometricObject(1,2), 
				new RectangleFromSimpleGeometricObject(1,4)};

		for (int i = 0; i < Colorable.length; i++) {
		 	System.out.println("\nColor #" + (i + 1));
		 	System.out.println("Area: " + Colorable[i].getArea());
		 	System.out.println("How to color: " + (Colorable[i]).howToColor());
		 } 
	}
}