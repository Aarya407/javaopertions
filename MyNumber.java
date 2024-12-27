public class MyNumber
{
	private int no;
	/**
	This is default constructor
	*/
	MyNumber()
	{
		no=5;
	}
	/**
	this is parameterized constructor
	*/
	MyNumber(int no)
	{
		this.no=no;
	}
	/**
	This is function checks whether no is negative
	*/
	public void isNegative()
	{
		if(no<0)
		System.out.println("Give number is negative");
	}
	/**
	This is function checks whether no is positive
	*/
	public void isPositive()
	{
		if(no>0)
		System.out.println("Give number is positive");
	}
	/**
	This is function checks whether no is zero
	*/
	public void isZero()
	{
		if(no==0)
		System.out.println("Give number is zero");
	}
	/**
	This is function checks whether no is odd
	*/
	public void isOdd()
	{
		if(no%2!=0)
		System.out.println("Give number is odd");
	}
	/**
	This is function checks whether no even
	*/
	public void isEven()
	{
		if(no%2==0)
		System.out.println("Give number is Even");
	}
	public static void main(String[] args)
	{
	/**
	This is main function 
	*/
	MyNumber n1= new MyNumber();
	System.out.println(n1.no+"\tDetails");
	n1.isNegative();
	n1.isPositive();
	n1.isZero();
	n1.isOdd();
	n1.isEven();
	
	int n=Integer.parseInt(args[0]);
	
	MyNumber n2= new MyNumber(ns);
	System.out.println(n2.no+"\tDetails");
	n2.isNegative();
	n2.isPositive();
	n2.isZero();
	n2.isOdd();
	n2.isEven();
	
	}
}
