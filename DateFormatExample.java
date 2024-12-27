import java.text.SimpleDateFormat;
import java.util.Date;
public class DateFormatExample
{
	public static void main(String[]  args)
	{
	Date today=new Date();
	SimpleDateFormat df=new SimpleDateFormat("dd/MM/yyy");
	String date =df.format(today);
	System.out.println("\nCurrent Date is:"+date);
	
	df=new SimpleDateFormat("MM-dd-yyyy");
	date =df.format(today);
	System.out.println("\nCurrent Date is:"+date);
	
	df=new SimpleDateFormat("EEEEEEE d MMM yyyy");
	date =df.format(today);
	System.out.println("\nCurrent Date is:"+ date);
	
	System.out.println("\nCurrent Date and Time is:"+date);
	
	df=new SimpleDateFormat("dd/MM/yy HH:mm:ssaaZ");
	date =df.format(today);
	System.out.println("\nCurrent Date and Time is:"+date);
	
	df=new SimpleDateFormat(" HH:mm:ss");
	date =df.format(today);
	System.out.println("\nCurrent Time is:"+date);
	
	df=new SimpleDateFormat("w");
	date =df.format(today);
	System.out.println("\nCurrent week of year:"+date);
	
	df=new SimpleDateFormat("W");
	date =df.format(today);
	System.out.println("\nCurrent week of month:"+date);
	
	df=new SimpleDateFormat("D");
	date =df.format(today);
	System.out.println("\nCurrent day of the year:"+date);
	
	df=new SimpleDateFormat("d");
	date =df.format(today);
	System.out.println("\nCurrent day of month:"+date);
	}
}
