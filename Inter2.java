//WAP in java to study about the INTERFACE class
//Inter2.java

class one
{
	int roll_no;
	String name;
	void getdata(int rn,String n)
	{
		roll_no = rn;
		name = n;
	}
}

class two extends one
{
	int sub1,sub2;
	void getdata1(int s1,int s2)
	{
		sub1 = s1;
		sub2 = s2;
	}
}

interface three
{
	int sub3 = 90;
}

interface five
{
	int sub4 = 80;
}

class four extends two implements three,five
{
	void disp()
	{
		int t = sub1+sub2+sub3+sub4;
		double per = t/4;
		System.out.println("ROLL NO : "+roll_no);
		System.out.println("NAME :" +name);
		System.out.println("TOTAL : " +t);
		System.out.println("PERCENTAGE : " +per);
	}
	
}
class Inter2
{
	public static void main(String args[])
	{
		int rn = Integer.parseInt(args[0]);
		String n = args[1];
		int s1,s2;
		s1 = Integer.parseInt(args[2]);
		s2 = Integer.parseInt(args[3]);
		four v = new four();
		v.getdata(rn,n);
		v.getdata1(s1,s2);
		v.disp();
	}
}

//HAPPY CODING...:)