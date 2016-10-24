//WAP in java to implement Function Overloading
//Fun_over2.java

class any
{
	String itm;
	double rate;
	int q;
	void get(String s)
	{
		itm =s;	
		System.out.println("ITEAM NAME IS : "+itm);
	}
	void get(double b,int c)
	{	
		rate = b;
		q = c;x
		System.out.println("ITEAM RATE IS : "+rate);
		System.out.println("ITEAM Quanty IS : "+q);
	}	
	void put()
	{
	
		System.out.println("amount  IS : "+ (rate*q));
	}
	
}	
class Fun_over2
{
	public static void main(String args[])
	{
		any v = new any();
		String ss = args[0];
		double rr = Double.parseDouble(args[1]);
		int qq = Integer.parseInt(args[2]);
		v.get(ss);
		v.get(rr,qq);
		v.put(); 
	}
}

//HAPPY CODING...:)