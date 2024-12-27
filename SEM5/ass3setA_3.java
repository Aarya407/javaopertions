interface opertion
{
	double pi=3.14;
	double area();
	double volume();
}

class cylinder implements opertion
{
	int rad;
	int height;
	cylinder(int rad,int height)
	{
		this.rad=rad;
		this.height=height;
	}
	public double area()
	{
		System.out.println("\nArea of cylinder:");
		return 2*pi*rad*height+2*pi*Math.pow(rad,2);
	}
	public double volume()
	{
		System.out.println("\nArea of cylinder:");
		return pi*Math.pow(rad,2)*height;
	}
}

public class ass3setA_3
{
 	public static void main(String args[])
 	{
 		opertion op= new cylinder(3,4);
 		System.out.println(op.area()+".............");
 		System.out.println(op.volume()+".........");
 	}
}
 		
