//WAP in java to Reverse the 3 digit no.
//Reverse.java

class Reverse
{
	public static void main(String args[])
	{
		int a = 123,r,q;
		r = (a % 10)*100;
		q = a/10;
		r = r + (q % 10)*10;
		q = a/100;
		r = r + (q % 10)*1;
		System.out.println("Reverse of 123 is : "+r);
	}
}

//HINT : MODULO OPERATOR i.e. % returns the REMAINDER
//		 DIVISION OPERTOR i.e. / returns the QUOTIENT
//HAPPY CODING...:)