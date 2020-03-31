import java.util.Scanner;
public class ForLoop 
{	
	public static void main(String[] args) 
	{
		System.out.println("Hello! How many Stars would you like?");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		
		for(int i = 0; i <= num; i++) 
		{
			for(int j = 0; j < i; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i = num - 1; i > 0; i--) {
			for(int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
