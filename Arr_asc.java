//WAP in java to sort the no.s stored in the Array (in ascending order)..
//Arr_asc.java

class Arr_asc
{
	public static void main(String args[])
	{
		int a[] = new int[10];
		int temp;
		for(int i=0 ; i<5 ;i++)
		{
			a[i] = Integer.parseInt(args[i]);
		}
		
		for(int i=0 ; i<5 ;i++)
		{
			for(int j = 1+i ; j<5 ; j++)
			{
			if(a[i] > a[j])
			{
				temp = a[i];
				a[i] = a[j];
				a[j] = temp;
			}
			}
		}
		for(int i=0 ; i<5 ; i++)
		{
			System.out.println(a[i]);
		}
	}
}

//YOU CAN USE ANY OF THE SORTING TECHNIQUE TO SORT THE NUMBERS....
//HAPPY CODING :)