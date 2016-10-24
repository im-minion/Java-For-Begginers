//WAP in java to accept the two no.s from user and display addition.....
//USING BUFFEREDREADER

import java.io.*;

class Userinput
{
	public static void main(String args[]) throws Exception
	{
		int a,b,c;
		String name;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter a");
		a=Integer.parseInt(br.readLine());
		System.out.println("enter b");
		b=Integer.parseInt(br.readLine());
		c=a+b;
		System.out.println("enter name");
		name=(br.readLine());
		System.out.println("the add is: "+c);
		System.out.println("name is: "+name);
	}
}

//HAPPY CODING...:)