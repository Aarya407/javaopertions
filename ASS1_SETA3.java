import java.util.Scanner;
public class ASS1_SETA3
{
	public static int fact(int n)
	{
	if(n==0)
	return 1;
	else 
	return(n*fact(n-1));
	}
	public static void main(String[] args)
	{
	Scanner in = new Scanner(System.in);
	int ch;
	do
	{
	System.out.println("1.Volume of cylinder");
	System.out.println("2.Factorial of number");
	System.out.println("3.Check the number is Armstrong or not");
	System.out.println("Exit");
	System.out.println("Enter your choice");
	ch=in.nextInt();
	switch(ch)
	{
	case 1:
		System.out.println("Enter Height and Radius of Cylinder");
		int height=in.nextInt();
		int radius=in.nextInt();
		double pie=3.14285714286;
		double volume=pie*(radius*radius)*height;
		System.out.println("Volume of cylinder=\t"+volume);
		break;
	case 2:
		System.out.println("Enter a number");
		int n=in.nextInt();
		System.out.println("Factorialof"+n+"is\t"+fact(n));
		break;
	case 3:
		int number,og,rem,result=0;
		System.out.println("Enter a number");
		int num=in.nextInt();
		og=num;
		while(og!=0)
		{
		rem=og%10;
		result+=Math.pow(rem,3);
		og/=10;
		}
		if(result== num)
		System.out.println(num+"\tis an Armstrong number");
		else
		System.out.println(num+"\tis not  an Armstrong number");
		break;
	default:
		System.out.println("Invalid Output");
		}
	}while(ch!=4);
}
}
