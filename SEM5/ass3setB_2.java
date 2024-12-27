import java.util.Scanner;
interface productdetail
{
}
public class Product implements productdetail
{
	static int cnt;
	int pid,qty;
	String pname;
	double pcost;
	public Product(int pid,String pname,double pcost, int qty)
	{
		cnt++;
		this.pid=pid;
		this.pname=pname;
		this.pcost=pcost;
		this.qty=qty;
	}
	public Product()
	{
		cnt++;
		this.pid=0;
		this.pname="";
		this.pcost=0;
		this.qty=0;
	}
	public String toString()
	{
		return pid+"\t"+pname+"\t"+pcost+"\t"+qty;
	}
	public static void main(String args[])
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Total No. pf Product");
		int n=sc.nextInt();
		Product[] p=new Product[n];
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter product id:");
			int pid=sc.nextInt();
			
			System.out.println("Enter product name:");
			String pname=sc.next();
			
			System.out.println("Enter product cost:");
			double pcost=sc.nextDouble();
			
			System.out.println("Enter product Quantity:");
			int q=sc.nextInt();
			p[i]=new Product(pid,pname,pcost,q);
		}
		System.out.println("======Product Details======");
		System.out.println("Id Name Cost Quantity");
		for(int i=0;i<n;i++)
			System.out.println(p[i]);
			System.out.println("Total no.of product objects="+Product.cnt);
		}
	}
			
