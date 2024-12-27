import java.io.*;
abstract class Staff
{
	protected int id;
	protected String name;
	Staff(int i,String n)
	{
		id=i;
		name=n;
	}
	public void display()
	{
		System.out.println("Id: "+id+"\nName: "+name);
	}
}
class Office_Staff extends Staff
{
 	String dept;
 	Office_Staff(int id,String n,String d)
 	{
 		super (id,n);
 		dept=d;
 	}
 	public void display()
 	{
 		super.display();
 		System.out.println("Dept: "+dept);
 	}
}

class ASS3SetA_2
{
	public static void main(String args[])throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter total no of Staff");
		int n=Integer.parseInt(br.readLine());
		Office_Staff[] st=new Office_Staff[n];
		
		for(int i=0;i<n;i++)
		{
			System.out.println("********Enter Information of Staff No: "+(i+1)+"********");
			System.out.println("Enter id");
			int id=Integer.parseInt(br.readLine());
			System.out.println("Enter name");
			String na=br.readLine();
			System.out.println("Enter Department:");
			String dept=br.readLine();
			st[i]=new Office_Staff(id,na,dept);
		}
		for(int i=0;i<n;i++)
			st[i].display();
	}
}
			
			
			
			
			
			
