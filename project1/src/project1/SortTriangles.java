package project1;

public class SortTriangles 
{
	public static void main(String[]args) 
	{
		ComparableTriangle[] Triangles = {
		new ComparableTriangle(1,1,1,1, "Black", true),
		new ComparableTriangle(2,2,2,2, "Blue", false),
		new ComparableTriangle(3,3,3,3, "Green", true),
		new ComparableTriangle(1,1,1,1, "Red", true)};
		java.util.Arrays.sort(Triangles);
		for (ComparableTriangle triangles: Triangles) {
			System.out.print(triangles + " ");
			System.out.println();
		}
	}
}
