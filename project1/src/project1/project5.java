package project1;

public class project5 
{
	   public static void main(String[] args) 
	   {

	       MyStack stack1 = new MyStack();
	       for (int i = 0; i < 10; i++) 
	       {
	           stack1.push(i);
	       }
	       MyStack stack2 = (MyStack) stack1.clone();
	       for (int j = 0; j <= 20; j++) 
	       {
	    	   stack1.push(j);
	       }
	       
	       stack1.pop();
	       
	       
	       System.out.println("stack1 size = " + stack1.getSize());
	   }

}
