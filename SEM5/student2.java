import java.io.*;
class student2
{
	private int rollno;
	private String sname;
	private float per;
	private static int cnt=0;
	public Student2(int r,String n,float p)
	{
		rollno=r;
		sname=n;
		per=p;
		cnt++;
	}
	public String toString()
	{
		return "Roll no :"+rollno+" Name: "+sname+"Percentage: "+per;
	}
	public static void sort(Student2 s[])
	{
		int i,j;
		String temp;
		int t1;
		float t2;
		for(i=0;i<s.length;i++)
		{
			for(j=0;j<s.length;j++)
			{
				if(s[i].per>s[j].per)
				{
				temp=s[i];
				s[i].sname=s[j].sname;
				s[j].sname=temp;
				
			
				t1=s[i];
				s[i].rollno=s[j].rollno;
				s[j].rollno=t1;
				
				t2=s[i];
				s[i].per=s[j].per;
				s[j].per=t2;
				}
			}
		}
	}
	public static void main(String[] args)throws IOException
	{
	 	int rno=1;
	 	BufferedReader(new InputStreamReader(System.in));
	 	Syetem.out.println("Enter How many students");
	 	int n=Intger.parseInt(br.readLine());
	 	Student2[] s=new Student2[n];
	 	Syetem.out.println("No of objects="+Student2.cnt);
	 	for(int i=0;i<n;i++)
	 	{
	 	Syetem.out.println("\n\t\tEnter The Name:");
	 	String sname=br.readLine();
	 	Syetem.out.println("\n\t\tEnter The Percentage:");
	 	float per=Float.parseFloat(br.readLine());
	 	s[i]=new Student2(rno.sname.per);
	 	rno++;
	 	}
	 	Syetem.out.println("No of objects="+Student2.cnt);
	 	for(int i=0;i<n;i++)
	 	{
	 		Syetem.out.println(s[i]);
	 		sort(s);
	 		Syetem.out.println("\n\t\t******Sorted Details are:");
	 		for(int i=0;i<n;i++)	
			Syetem.out.println(s[i]);
		}
	}
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
