import java.util.Scanner;
import student.*;
class StudentData
{
	public int roll,m[];
	public String name,cname;
	public double per;
	public StudentData(int r, String n, String c,int m[])
	{
		roll=r;
		name=n;
		cname=c;
		this.m=m;
	}
}
class Slip10_2
{
	public static void main(String[] args)
	{
		int m[]=new int[6];
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Roll No:");
		int roll=sc.nextInt();
		
		System.out.println("Enter Name :");
		String name=sc.next();
		
		System.out.println("Enter Class No:");
		String c=sc.next();
		
		System.out.println("Enter marks of 6 subjects ");
		for(int i=0;i<6;i++)
		m[i]=sc.nextInt();
		
		StudentData sd =new StudentData(roll,name,c,m);
		StudentPer sp =new StudentPer();
		sd.per=sp.calcper(m);
		StudentInfo si=new StudentInfo();
		si.display_student(sd.roll,sd.name,sd.cname,sd.per);
	}
}