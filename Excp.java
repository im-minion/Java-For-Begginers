//WAP in java to study about Exception Handling..
//Excp.java

class Excp
{
	public static void main(String args[])
	{
		try
		{
			int a=5,b=5,c;
			c = a/b;
			System.out.println("c : "+c);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Divide by zero eception : "+e);
		}
	}
}

//HAPPY CODING...:)