
public class exp 
{
		public exp(int x, int m)
		{
		if (m == 0)
		return 1;
		
		if (m == 1)
		return x;
		
		return x * exp(x, m-1);
		}
	
	public static void main(String[] args) {

        int x = -2, m = -3;
 
        long result = 1;

        while (m != 0)
        {
            result *= x;
            --m;
        }

        System.out.println("Answer = " + result);
    }
}
