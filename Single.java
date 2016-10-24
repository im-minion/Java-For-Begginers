//WAP in java for SINGLE INHERITANCE 
//Single.java
class One
{
	int a,b;
	void getdata()
	{
		a=20;
		b=10;
	}
}

class Two extends One
{
	int c;
	void putdata()
	{
		c=a+b;
		System.out.println("the add is: "+c);
	}
}

class Single
{
	public static void main(String args[])
	{
		Two t1=new Two();
		t1.getdata();
		t1.putdata();
	}
}

//HAPPY CODING...:)