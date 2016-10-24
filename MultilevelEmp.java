//WAP in java to Study about MULTILEVEL INHERITANCE
//MultilevelEmp.java

class one
{
	String emp_name;
	int emp_code;
	String emp_dept;
	void getdata(String en,int ec,String ed)
	{
		emp_name = en;
		emp_code = ec;
		emp_dept = ed;
	}
}

class two extends one
{
	double rph;
	int hr;
	void getdata1(double rh,int h)
	{
		rph = rh;
		hr = h;
	}
}

class three extends two
{
	void disp()
	{
		System.out.println("Emp name : " +emp_name);
		System.out.println("Emp code : " +emp_code);
		System.out.println("Emp dept : " +emp_dept);
		System.out.println("Emp Rate/hr : " +rph);
		System.out.println("Emp No. of hrs : " +hr);
		System.out.println("Emp Salary : " +(rph*hr));
	}
}

class MultilevelEmp
{
	public static void main(String args[])
	{
		three v = new three();
		String ename = args[0];
		int ecode = Integer.parseInt(args[1]);
		String edept = args[2];
		double rrhh = Double.parseDouble(args[3]);
		int hhrr = Integer.parseInt(args[4]);
		v.getdata(ename,ecode,edept);
		v.getdata1(rrhh,hhrr);
		v.disp();
	}
}

//HAPPY CODING...:)