import java.util.Scanner;
public class Ex04
{
	public static void main(String[] args)
	{
		Scanner ob = new Scanner(System.in);
		System.out.println("Input character:");
		char num1 = ob.next().charAt(0);
		switch(num1)
		{
			case 'a':	case 'e':	case 'i':	case 'o':	case 'u':
	        case 'A':	case 'E':	case 'I':	case 'O':	case 'U':
            System.out.println("It is Vowel");			
			break;
			default:System.out.println("Invalid vowel range");
		}
	}
}