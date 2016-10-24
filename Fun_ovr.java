//WAP in java to implement Function Overloading
//Fun_ovr.java

class abc
{
	int rn;
	String name;
	void get(int r)
	{
		rn = r;
		System.out.println("Roll no is : "+rn);
	}
	void get(String x)
	{
		name = x;
		System.out.println("Name is : " +name);
	}
	
}
class Fun_ovr
{
	public static void main(String args[])
	{
		abc v = new abc();
		int aa=Integer.parseInt(args[0]);
		String bb = args[1];
		v.get(aa);
		v.get(bb);
	}
}

//HAPPY CODING...:)