//WAP in java with a single inheritance and use the super() function....
//SuperDemo.java



class Rectangle
{
	int a,b,l;
	Rectangle(int x,int y)
	{
		l = x;
		b = y;
	}
	void area()
	{
		a = l*b;	
		System.out.println("AREA OF RECTANGLE IS : "+a);
	}
}
class Box extends Rectangle
{
	int v,h;
	Box(int x,int y,int z)
	{
	//	h = z;
	
		super(x,y);
		h=z;
}
	void volume()
	{
		v = l*b*h;	
		System.out.println("VOLUME IS : "+v);
	}
}

class SuperDemo
{
	public static void main(String args[])
	{
		Box vm = new Box(2,3,4);
		vm.area();
		vm.volume();
	}
}

//HINT :"super()" function is used for.....
//CALLING THE CONSTRUCTOR OF OTHER CLASS which is INHERITED.....;)
//HAPPY CODING...:)