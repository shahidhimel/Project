import java.util.Scanner;

public class SingleRecursion 
{
	public static long sum (int n) 
	{
		//if (n < 0) throw
		//new IllegalArgumentException("Can't calculate function of negative");
		if (n == 1 )
			return 1;
		else if (n == 0)
			return 0;
		else if(n<0)
			return n + sum(n+1);
		else
			return n + sum(n-1);
	}
	
	public static void main(String[] args) 
	{
		Scanner stdIn = new Scanner (System.in);
		System.out.println("Sum of What number do you want to calculate?");
		int num = stdIn.nextInt();
		System.out.printf("%d = %d", num, sum(num));
		
		stdIn.close();
	}
}
