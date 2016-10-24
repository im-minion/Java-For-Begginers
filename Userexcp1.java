//WAP in java to know wehther the number is even or odd using "EXCEPTION HANDLING"
//create your own exception....
//2 numbers are taken as command line argument!!
//Userexcp1.java

class evenodd extends Exception
{
	evenodd()
	{
		System.out.println("Odd_Number");
	}
}

class Userexcp1
{
	public static void main(String args[])
	{
	  try
	  {
		int a,b;
		a = Integer.parseInt(args[0]);
		b = Integer.parseInt(args[1]);
		if(a%2 == 0)
			System.out.println("1st is Even number !!");
		else
			throw new evenodd();
		if(b%2 == 0)
			System.out.println("2nd is Even number !!");
		else
			throw new evenodd();
	  }
	  catch(evenodd eo)
          {}
	}
}

//HAPPY CODING...:)