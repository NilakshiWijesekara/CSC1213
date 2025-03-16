class HomeWork
{
	public static void main(String args[])
	{
		int a=10;
		int b=2;
		
		//using Unary operator
		int c=-b;
		System.out.println(c);
		
		int y=a++;
		System.out.println(y);
		
		int x=a--;
		System.out.println(x);
		
		boolean isTH=true;
		System.out.println(!isTH);
		
		//using Logical operator
		boolean n=true;
		boolean m=false;
		System.out.println(n&&m);
		System.out.println(n||m);
		System.out.println(!n);
		
		//using Relational operator
		System.out.println("a==b:"+(a==b));
		System.out.println("a!=b:"+(a!=b));
		System.out.println("a<b:"+(a<b));
		System.out.println("a>b:"+(a>b));
		System.out.println("a<=b:"+(a<=b));
		System.out.println("a>=b:"+(a>=b));
		
		//using Ternary operator
		//using ternary operator to find the maximum number
		int max=(a>b)?a:b;
		System.out.println("The maximum number is :"+max);
		
		//using Assignment operator
		a+=5;
		System.out.println(a);
		a-=2;
		System.out.println(a);
		a*=5;
		System.out.println(a);
		a/=5;
		System.out.println(a);
		a%=2;
		System.out.println(a);
	}
}