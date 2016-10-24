//WAP in java to find a Factorial of a no. at cmd arg
//Factorial.java

class Factorial
{
	public static void main(String args[])
	{
		int a = Integer.parseInt(args[0]);
		int x=1;
		while(a>0)
		{
			x =  x*a;
			a--;
		}
		System.out.println("F : " +x);
	}
}

//HAPPY CODING...:)