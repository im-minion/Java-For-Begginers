//Using if...else... conditional statement in java to
//know profit or loss from the cost price and selling price
//given as cmd line args..
//Condition.java

class Condition
{
	public static void main(String args[])
	{
		double cp,sp,r;
		cp = Double.parseDouble(args[0]);
		sp = Double.parseDouble(args[1]);
		
		if(cp>sp)
		{
			
			r = cp - sp;
			System.out.println("LOSS!!! by "+r);
		}
		else
		{
			r = sp - cp;
			System.out.println("PROFIT!!! by "+r);
		}
	}
}

//HAPPY CODING...:)