//WAP in java to take a 2 numbers as command line argument and
//swap their values also display the values BEFORE and AFTER SWAPPING..
//Swap.java

class Swap
{
	public static void main(String args[])
	{
		double a,b,temp;
		a = Double.parseDouble(args[0]);
		b = Double.parseDouble(args[1]);
		System.out.println("BEFORE\nvalue of a : " +a+ " value of b : "+b);
		temp = a;
		a = b;
		b = temp;
		System.out.println("AFTER\nvalue of a : " +a+ " value of b : "+b);
	}
}

//HAPPY CODING...:)