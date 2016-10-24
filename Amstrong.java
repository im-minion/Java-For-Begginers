//WAP in java to accept a no. from cmd and display weather that
//no. is ARMSTRONG NUMBER or NOT...
//Amstrong.java

class Amstrong
{
	public static void main(String args[])
	{
		int a = Integer.parseInt(args[0]);
		int q,x,y,z,r;
		x = a % 10;
		q = a/10;
		y = q % 10;
		q = q/10;
		z = q % 10;
		r = x*x*x + y*y*y + z*z*z;
		if(a == r)
		{
			System.out.println("Given no. is Amstrong no.");
		}
		else
		{
			System.out.println("Not an Amstrong no.");
		}
	}
}

//HAPPY CODING...:)