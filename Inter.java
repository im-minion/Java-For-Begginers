//WAP in java to study about the INTERFACE class
//Inter.java

class one
{
	int a;
	void getdata()
	{
	a=10;
	}
}

interface two
{
	int b=20;
	void display();
}

class Three extends one implements two
{
	void great()
	{
		if(a>b)
		{
			System.out.println("a is greater");
		}
		else
		{
			System.out.println("b is greater");
		}
	}
	public void display()
	{
		System.out.println("the value of : "+b);
	}
}

class Inter
{
	public static void main(String args[])
	{
		Three t1=new Three();
		t1.getdata();
		t1.display();
		t1.great();
	}
}


//AS JAVA DOSEN'T SUPPORT MULTIPLE INHERIANCE ..INTERFACE IS USED
//INTERFACE IS SIMILAR AS THAT OF INHERITANCE BUT NOT SAME.....
//HAPPY CODING...:)