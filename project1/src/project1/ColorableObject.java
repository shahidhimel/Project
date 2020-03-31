package project1;

public class ColorableObject 
{
	public static void colorableObject(Colorable color) 
	{
		color.howToColor();
	}
	interface Colorable
	{
		public static String getArea()
		{
			return getArea();
		}
		public default String howToColor() {
			return toString() + " Color inside of the Rectangle " + getArea();
		}
	}
}