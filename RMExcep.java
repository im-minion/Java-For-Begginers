//WAP in java which contains 2 USER EXCEPTION for roll no. and marks(accept a roll no. and marks in 3 subj.)
//if ROLL NO IS > 30 EXCEPTION should occur and
//if MARK(for any one of 3 sub) is/are > 100 EXCEPTION should occur...
//and if Everything is OK!! then find TOTAL and PERCENTAGES...
//RMEecep.java

class Rolle extends Exception
{
	Rolle()
	{
		System.out.println("Invalid Roll Number!!");
	}
}

class Marke extends Exception
{
	Marke()
	{
		System.out.println("Invalid mark/s (should be <100)");
	}
}

class RMExcep
{
	public static void main(String args[])
	{
		try
		{
			int rn,s1,s2,s3;
			rn = Integer.parseInt(args[0]);
			s1 = Integer.parseInt(args[1]);
			s2 = Integer.parseInt(args[2]);
			s3 = Integer.parseInt(args[3]);
			if(rn>30)
			throw new Rolle();
			else
			{
				try
				{
					if(s1>100 || s2>100 || s3 >100)
						throw new Marke();
					else
					{	int t = s1+s2+s3;
						double p = t/3;
						System.out.println("Total = "+t);
						System.out.println("Percentage = "+p);
					}
				}
				catch(Marke m)
				{}
			}	
		}
		catch(Rolle r)
		{}
	}
}

//HAPPY CODING...:)