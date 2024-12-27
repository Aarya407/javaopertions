import java.util.Scanner;
public class Area2
{
	public static void main(String[] args)
	{
	int l,b,perimeter, area;
	Scanner s =new Scanner(System.in);
	System.out.println("Enter length of rectangle:");
	l=s.nextInt();
	System.out.println("Enter breadth of rectangle:");
	b=s.nextInt();
	perimeter=2*(l+b);
	System.out.println("Perimeter of rectangle:"+perimeter);
	area=l*b;
	System.out.println("Area of rectangle:"+area);
	}
}
