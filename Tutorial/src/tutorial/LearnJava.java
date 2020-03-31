package tutorial;

public class LearnJava 
{
	public static void main(String[] args) 
	{
		String name = "My name is Shahid";
		int age = 28;
		char question = '?';
		boolean live = true;
		boolean dontLive = false;
		boolean allInfo = false;
		int info = 0;
		
		
		System.out.println(name);
		System.out.println("My age is " + age);
		System.out.println("What can I do for you" + question);
		System.out.println();
		
		if(true) 
		{
			System.out.print("I live in Queens");
			info = info + 1;
		}
		if(live) 
		{
			System.out.println(", jamaica!");
			info = info + 1;
		}
		if(dontLive) 
		{
			System.out.println("Address is 170 street!");
			info = info + 1;
		}
		if(info == 3) 
		{
			allInfo = true;
		}
		if(allInfo) 
		{
			System.out.println("All info is correct!");
		}
		else
		System.out.println("Dont live in Bronx");
		
		DoubleLongFloat number = new DoubleLongFloat();
		System.out.println(number);
		
		
	}
}
