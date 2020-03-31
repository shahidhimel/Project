package project2;

public class MyPriorityQueue extends PriorityQueueDemo implements Cloneable
{
	public Object clone() throws CloneNotSupportedException
	{
		PriorityQueueDemo queueClone = (PriorityQueueDemo)super.clone();
		return queueClone;
	}

	public String getSize() 
	{
		
		return null;
	}
}
