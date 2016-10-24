//WAP in java to aceept a no. on cmd line arg 
//and then display the "TABLE" of it..
//Dw.java

class Dw
{
	public static void main(String args[])
	{
		int x = Integer.parseInt(args[0]);
		int a =1,y;
		do
		{
			y = x*a;
			System.out.println(" "+y);
			a++;
		}while(a<=10);
	}
}

//HAPPY CODING...:)