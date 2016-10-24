//WAP in java to accept a no. from cmd line arg, and find & display its cube...
//USE WHILE LOOP

class Wh
{
	public static void main(String args[])
	{
		int a = Integer.parseInt(args[0]);
		int y =1,x = 0;
		while(x<3)
		{
			y = y*a;
			x++;
		}
		System.out.println("Cube of given no. is : " +y);
	}
}

//HAPPY CODING...:)