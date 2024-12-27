public class Myclass2
{
	int num;
	public Myclass2()
	{
	 num=0;
	}
	public Myclass2(int num)
	{
	 this.num=num;
	}
	public static void main(String[] args)
	{
		Myclass2 m1= new Myclass2();
		if(args.length>0)
		{
			int n=Integer.parseInt(args[0]);
			Myclass2 m2= new Myclass2(n);
			System.out.println(m1.num);
			System.out.println(m2.num);
		}
	}
}


