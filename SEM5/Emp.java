class Emp
{
	String name;
	double salary;
	public Emp(String name, double salary)
	{
		return salary;
	}
}
class Manger extends Emp
{
	double ta,ha;
	public Manger(String name,double salary,double ta,double ha)
	{
	super(name,salary);
	this.ta=ta;
	this.ha=ha;
	}
	@Override
	public double getSalary()
	{ 
		return super.getSalary()+ta+ha;
	}
}
public class Slip27_1
{
 	public static void main(String args[])
 	{
 		Emp e1=new  Emp("Aaa",5000,0);
 		System.out.println("Empoyee Name= "+e1.name"Salary= "e1.getSalary());
 		Manger mn =new Manger("abc",2000.0,3000,5000);
 		System.out.println("Empoyee Name= "+mn.name"Salary= "mn.getSalary()));
 	}
}

