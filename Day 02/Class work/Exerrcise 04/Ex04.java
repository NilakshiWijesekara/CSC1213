import java.util.Scanner;
class Ex04
{
	public static void main(String args[])
	{
		String name;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your name:");
		name= sc.nextLine();
		System.out.println("Enter your Age:");
		int Age=sc.nextInt();
		System.out.println("Enter your Reg No:");
		String Regno=sc.next();
		System.out.println("Enter your Sex:");
		char Sex=sc.next().charAt(0);
		System.out.println("Enter your Mobile Number:");
		long moblie=sc.nextLong();
		System.out.println("Enter your GPA:");
		double GPA=sc.nextDouble();
		
	}
}