package project2;
import java.util.ArrayList;

public class MyQueue 
{
	ArrayList<Object> list = new ArrayList<Object>();
	
	
	public boolean isEmpty() 
	{
		return list.isEmpty();
	}
	public int getSize() 
	{
		return list.size();
	}
	public Object peek() 
	{
		return list.get(getSize() - 1);
	}
	public Object poll() 
	{
		Object o = list.get(getSize() - 1);
		list.remove(getSize() - 1);
		return o;
	}
	public void push(Object o) 
	{
		list.add(0, o);
	}
	
	public String toString(String Object) 
	{
		return "Queue: " + list.toString();
	}
}
