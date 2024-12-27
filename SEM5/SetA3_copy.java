import java.io.*;
public class SetA3_copy
{	
	public static void main(String args[])throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Source File Name");
		String f1=br.readLine();
		System.out.println("Enter Destination File Name");
		String f2=br.readLine();
		FileReader in=new FileReader (f1);
		FileWriter out=new FileWriter(f2);
		int c;
		while((c=in.read())!=-1)
		out.write(c);
		out.write("\nEnd of file");
		in.close();
		out.close();
		FileReader fr=new FileReader(f2);
		while((c=fr.read())!=-1)
		System.out.print((char)c);
	}
}
