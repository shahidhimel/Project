package project2;
import java.util.ArrayList;

public class TestArrayList 
{
	public static void main(String[] args) 
	{
		ArrayList<String> cityList = new ArrayList<String>();
		
		cityList.add("Denver");
		cityList.add("Paris");
		cityList.add("Miami");
		cityList.add("Seoul");
		cityList.add("Tokyo");
		cityList.add("New York");
		cityList.add("Boston");
		cityList.add("Los Angeles");
		
		System.out.println("List size? " + cityList.size());
		System.out.println("Is Miami in the list ? " + 
				cityList.contains("Miami"));
		System.out.println("The location of Los Angeles in the list? " + 
				cityList.indexOf("Los Angeles"));
		System.out.println("Is the list empty ? " +
				cityList.isEmpty());
		
		
		cityList.add(2, "Xian");
		cityList.remove("Paris");
		cityList.remove(7);

		System.out.println(cityList.toString());
		for (int i = cityList.size(); i >= 0; i++)
		System.out.print(cityList.get(i) + ", ");
		//System.out.println();

	}
}

