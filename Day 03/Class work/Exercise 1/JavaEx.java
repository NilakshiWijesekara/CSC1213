import java.util.Scanner;
public class JavaEx
{
	public static void main(String[] args)
	{
		Scanner ob = new Scanner(System.in);
		System.out.println("Enter the number");
		int num1 = ob.nextInt();
		if(num1 > 0)
		{
			System.out.println("Number is positive");
		}
		else if(num1 <0)
		{
			System.out.println("Number is negative");
		}
		else
		{
			System.out.println("Number is zero");
		}
	}
}