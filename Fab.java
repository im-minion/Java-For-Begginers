//WAP in java to display FIBONACCI SERIS
//Fab.java

class Fab
{
	public static void main(String args[])
	{
		int x=0;
		int y = 1;
		int z;
		System.out.println(x);
		System.out.println(y);
		for(int a = 0 ; a<10 ; a++)
		{
			
			z= y+x;
			System.out.println(z);
			x=y;
			y=z;
		}
	}
}

//HAPPY CODING...:)