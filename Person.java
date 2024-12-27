import java.util.Scanner;
class Person
{
String fname,lname,mname;
public Person(String fname, String mname, String lname)
{
this.fname=fname;
this.lname=lname;
this.mname=mname;
}
public String toString()
{
String fnamefirst=fname.substring(0,1);
String fremainingLetters=fname.substring(1,fname.length());
fnamefirst=fnamefirst.toUpperCase();
fname=fnamefirst + fremainingLetters;

String mnamefirst=mname.substring(0,1);
String mremainingLetters=mname.substring(1,mname.length());
mnamefirst=mnamefirst.toUpperCase();
mname=mnamefirst + mremainingLetters;

String lnamefirst=lname.substring(0,1);
String lremainingLetters=lname.substring(1,lname.length());
lnamefirst=lnamefirst.toUpperCase();
lname=lnamefirst + lremainingLetters;

return lname+" "+fname+" "+mname;
}

public static void main(String[] args)
{

Scanner sc= new Scanner(System.in);
System.out.println("Enter Firstname, Middlename and Lastname of a Person");
String f=sc.next();
String m=sc.next();
String l=sc.next();
Person p=new Person(f,m,l);
System.out.println(p);
}
}
