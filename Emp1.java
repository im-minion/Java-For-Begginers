//WAP in java to take a info about employee using getdata() fun.
//and display it using disp() fun....
//Emp.java


import java.io.*;
class Emp
{
	int empc;
	String empn;
	int emps;
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	void getdata() throws Exception
	{
		
		System.out.println("Enetr Name : ");
		empn = br.readLine();
		System.out.println("Enetr Code : ");
		empc = Integer.parseInt(br.readLine());
		System.out.println("Enetr Salary : ");
		emps = Integer.parseInt(br.readLine());
	}
	void disp()
	{
		System.out.println("Name : "+empn);
		System.out.println("Code : "+empc);
		System.out.println("Salary : "+emps);
	}
}
class  Emp1
{
	public static void main(String args[]) throws Exception
	{
		Emp v = new Emp();
		v.getdata();
		v.disp();
	}
}

//HAPPY CODING...:)