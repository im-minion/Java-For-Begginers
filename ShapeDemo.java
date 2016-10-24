//WAP in java ,make a abstract class named "shape" create 2 other two classes "Circle"
//and "Rectangle" which inherits "shape" ...
//Give the random valuse to calculate the area of both...
//ShapeDemo.java


abstract class shape
{
	abstract void area();
}
class Circle extends shape
{
	double r,a;
	Circle(int x)
	{
		r= x;
	}
	void area()
	{
		a =3.14*r*r;
		System.out.println("Area of circle : "+a);
	}
}

class Rectangle extends shape
{
	double l,b,a;
	Rectangle(int x,int y)
	{
		l=x;
		b =y;
	}
	void area()
	{
		a = l*b;
		System.out.println("Area of rectangle is : "+a);
	}
}

class ShapeDemo
{
	public static void main(String args[])
	{
		
		Circle c1 = new Circle(2);
		Rectangle r1 = new Rectangle(3,2);
		c1.area();
		r1.area();
	}
}

//HINT : Rember you CAN NOT CREATE thr OBJECT of ABSTRACT CLASS..:)
//HAPPY CODING :)