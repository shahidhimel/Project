package project2;
//import java.util.ArrayList;

public class Project2 
{
	public static void main(String[] args) 
	{
		MyQueue r = new MyQueue();
		
		r.push("Denver");
		r.push("Paris");
		r.push("London");
		r.push("New York");
		
		System.out.println("Array from the begining");
		for(int i=r.getSize()-1; i>=0; i--) 
		{
			System.out.print(r.list.get(i) + ", ");
		}
		
		System.out.println("\nSize of Array is " + r.getSize());
		System.out.println("Is Array empty? " + r.isEmpty());
		System.out.println("Last out = " + r.poll());
		System.out.println("Last element = " + r.peek());
		
		System.out.println("Array after the poll");
		for(int i=0; i<r.getSize(); i++) 
		{
			System.out.print(r.list.get(i) + ", ");
		}
		//System.out.println("Last out = " + r.push());
	}
}
