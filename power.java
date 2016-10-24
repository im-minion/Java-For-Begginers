//WAP in java to find the power of no. provided as cmd arg.
//power.java

class abc
{
	int a,b,r= 1;
	void result(int a,int b)
	{
		for(int i=0 ; i<a; i++)
		{
			r = r*b;
		}
		System.out.println("Result is :"+r);	
	}
}

class power
{
	public static void main(String args[])
	{
		int aa = Integer.parseInt(args[0]);
		int bb = Integer.parseInt(args[1]);
		abc v = new abc();
		
		v.result(aa,bb);
	}
}

//HAPPY CODING...:)