//WAP in java to study about the ABSTRACT CLASS..
//Abst.java

abstract class Calculator
{
	abstract void cal();
}

class Add extends Calculator
{
	int x,y,c;
	Add(int a,int b)
	{
		x = a;
		y = b;
	}
	void cal()
	{
		c = x+y;
		System.out.println("Addition is : "+c);
	}
}

class Sub extends Calculator
{
	int x,y,c;
	Sub(int a,int b)
	{
		x = a;
		y = b;
	}
	void cal()
	{
		c = x-y;
		System.out.println("Subtraction is : "+c);
	}
}

class Mul extends Calculator
{
	int x,y,c;
	Mul(int a,int b)
	{
		x = a;
		y = b;
	}
	void cal()
	{
		c =x*y;
		System.out.println("Multiplication is : " +c);
	}
}

class Div extends Calculator
{
	int x,y,c;
	Div(int a,int b)
	{
		x = a;
		y = b;
	}
	void cal()
	{
		c =x/y;
		System.out.println("Division is : " +c);
	}
}

class Abst
{
	public static void main(String args[])
	{
		int p = Integer.parseInt(args[0]);
		int q = Integer.parseInt(args[1]);
		Add a1 = new Add(p,q);
		a1.cal();
		Sub s1 = new Sub(p,q);
		s1.cal();
		Mul m1 = new Mul(p,q);
		m1.cal();
		Div d1 = new Div(p,q);
		d1.cal();	
	}
}

//HAPPY CODING...:)