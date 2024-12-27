import java.io.*;
public class Buff
{
	public static void main(String[] args)throws IOException
	{
	int l,b,perimeter, area;
	
	BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
	
	System.out.println("Enter length of rectangle:");
	
	l=Integer.parseInt(br.readLine());
	
	System.out.println("Enter breadth of rectangle:");
	
	b=Integer.parseInt(br.readLine());
	
	perimeter=2*(l+b);
	
	System.out.println("Perimeter of rectangle:"+perimeter);
	
	area=l*b;
	
	System.out.println("Area of rectangle:"+area);
	}
}
