//WAP in java which will illustrate concept about static members and
//static member functions...
//Use_static.java

class Use_static
{
	static int a = 3;
	static int b;
	static void meth(int x)
	{
		System.out.println("x : "+x);
		System.out.println("a : "+a);
		System.out.println("b : "+b);
	}
	static
	{
		System.out.println("Static block is inzed !!");
		b = a*5;
	}
	public static void main(String args[])
	{
		meth(4);
	}
}

//HINT: Rember STATIC FUNCTIONS can use STATIC MEMBERS only!!!
//HAPPY CODING...:)