package project1;

public class Project1 
{
public static void main(String[] args) 
{
	/*SimpleGeometricObject  G1 = new SimpleGeometricObject();
	System.out.println(G1.toString());
	G1.setColor("Black");
	G1.setFilled(true);
	System.out.println(G1);
	
	CircleFromSimpleGeometricObject C1 = new CircleFromSimpleGeometricObject();
			
	C1.printCircle();
	System.out.println(C1);
	C1.setRadius(5);
	System.out.println("Area = " + C1.getArea());
	System.out.println("Diameter = " + C1.getDiameter());
	System.out.println("Perimeter = " + C1.getPerimeter());
	
	CircleFromSimpleGeometricObject C2 = new CircleFromSimpleGeometricObject(5, "Black", true);
	System.out.println(C2);
	
	RectangleFromSimpleGeometricObject R1 = new RectangleFromSimpleGeometricObject(5,5, "Orange", true);
	System.out.println(R1);*/
	
	
	TriangleFromSimpleGeometricObject T1 = new TriangleFromSimpleGeometricObject(5,5,5, "Blue", true);
	System.out.println(T1);
	System.out.println("The Area = " + T1.getArea());
	System.out.println("The Perimeter = " + T1.getPerimeter());
	System.out.println("The Height = " + T1.getHeight());
	
}
}
