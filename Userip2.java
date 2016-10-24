//WAP in java to take a i/p from user for Student roll number and
//marks in 3 subjects and then display the TOTAL, PERCENTAGE, GRADE...
//Userip2.java

import java.io.*;

class Userip2
{
	public static void main(String args[]) throws Exception
	{
		int sub1,sub2,sub3,rn,t;
		double pr;
		char g;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter roll no: ");
		rn = Integer.parseInt(br.readLine());		
		System.out.println("Enter sub1 : ");
		sub1 = Integer.parseInt(br.readLine());
		System.out.println("Enter sub2 : ");
		sub2 = Integer.parseInt(br.readLine());		
		System.out.println("Enter sub3 : ");
		sub3 = Integer.parseInt(br.readLine());
		t = sub1+sub2+sub3;
		System.out.println("ROLL NO : "+rn);
		System.out.println("Total is : "+t);
		pr = t/3;
		System.out.println("Percentage : "+pr);
		if(pr >= 75)
			System.out.println("A grade");
		else if(pr >= 60)
			System.out.println("B grade");
		else if(pr >= 40)
			System.out.println("C grade");
		else
			System.out.println("FAIL !!!");
	}
}

//HAPPY CODING...:)