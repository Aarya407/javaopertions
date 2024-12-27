import java.util.Scanner;
interface PrintCubeNumber
{
	public void print(int num1);
}
public class PrintCube
{
	public static void main(String[] a)
	{
		PrintCubeNumber p=n->System.out.println("Cube is:"+n*n*n);
		Scanner sc =new Scanner (System.in);
		int no;
		System.out.print("Please Enter any Number :");
		no=sc.nextInt();
		p.print(no);
	}
}
