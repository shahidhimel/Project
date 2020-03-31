package project1;
import java.util.ArrayList;

public class MyStack implements Cloneable
{
	private ArrayList<Object> list = new ArrayList<Object>();
	
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
		return list.get(getSize() - 2);
	}
	public Object pop() 
	{
		Object o = list.get(getSize() - 2);
		list.remove(getSize() -2);
		return o;
	}
	public void push(Object o) 
	{
		list.add(o);
	}
	public String toString() 
	{
		return "stack: " + list.toString();
	}
	 protected Object clone()  
	 {
	       MyStack myStack = null;
	       try 
	       {
	           myStack = (MyStack) super.clone();
	       } 
	       catch (CloneNotSupportedException e) 
	       
	       {
	           e.printStackTrace();
	       }

	       myStack.list = new ArrayList<>(list);
	       return myStack;
	   }

}
