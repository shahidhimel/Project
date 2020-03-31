package project2;
import java.util.*;

public class PriorityQueueDemo implements Cloneable
{

	//public static void main(String[] args) 
	{
		PriorityQueue<String> queue1 = new PriorityQueue<String>();
		queue1.offer("Oklahoma");
		queue1.offer("Indiana");
		queue1.offer("Georgia");
		queue1.offer("Texas");
		
		System.out.println("Proirity queue using comparable: ");
		while(queue1.size() > 0) 
		{
		System.out.println(queue1.remove()+ " ");
		}
		
		PriorityQueue<String> queue2 = new PriorityQueue<String>
		(4,  Collections.reverseOrder());
		queue2.offer("Oklahoma");
		queue2.offer("Indiana");
		queue2.offer("Georgia");
		queue2.offer("Texas");
		
		System.out.println("\nProirity queue using comparable: ");
		while(queue2.size() > 0) 
		{
		System.out.println(queue2.remove()+ " ");
		}

	}

}
