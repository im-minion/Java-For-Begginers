//WAP a program in java to state the use of "this" pointer
//Demo1.java

class Demo
{
	int a,b;
	void getdata(int a,int b)
	{
		this.a=a;
		this.b=b;
		System.out.println("the value of a is: "+a);
		System.out.println("the value of b is: "+b);
	}
	void display()
	{
		System.out.println("the value of a is: "+a);
		System.out.println("the value of b is: "+b);
	}
}

class Demo1
{
	public static void main(String args[])
	{
		Demo d1=new Demo();
		d1.getdata(2,3);
		d1.display();
	}
}

//HAPPY CODING...:)