//Reverse the 4 digit no. using constructor using java
//Constructor.java

class cons
{
	int xx,yy,zz;
	int r,q;
	cons(int xx)
	{
		
		r = (xx % 10)*1000;
		q = xx/10;
		r = r + (q%10)*100;
		q = xx/100;
		r = r + (q%10)*10;
		q = xx/1000;
		r = r+ (q%10)*1;
		System.out.println("REverse of 4 digit no is : "+r);
	}
	cons(int yy,int zz)
	{
		if(yy>zz)
			System.out.println("Greater no is : "+yy);
		else
			System.out.println("Greater no is : "+xx);
	}
	
}
class Constructor
{
	public static void main(String args[])
	{
		int a,b,c;
		a = Integer.parseInt(args[0]);
		b = Integer.parseInt(args[1]);
		c = Integer.parseInt(args[2]);
		cons v = new cons(a);
		cons p = new cons(b,c);
	}
}

//HAPPY CODING...:)