class InvalidMonthException extends Exception
{
	public InvalidMonthException()
	{
		System.out.println("Invalid Month Given:");
	}
}
class InvalidDayException extends Exception
{
	public InvalidDayException()
	{
		System.out.println("Invalid Day Given:");
	}
}
class UserExcDemo
{
	public static void main(String args[])
	{
		try
		{
			if(args.length<3)
				throw new NullPointerException();
			else
			{
				int dd=Integer.parseInt(args[0]);
				int mm=Integer.parseInt(args[1]);
				int yy=Integer.parseInt(args[2]);
				boolean leap=(yy%400==0)||(yy%4==0)||(yy%100==0);
				if(mm<1||mm>12)
					throw new InvalidMonthException();
				switch(mm)
				{
					case 1:case 3:case 5:case 7:case 8:case 10:case 12:
					if(dd<1 && dd>31)
					throw new InvalidDayException();
					break;
					case 6:case 9:case 11:
					if(dd<1||dd>30)
					throw new InvalidDayException();
					case 2:
					if(leap||dd>29)
					throw new InvalidDayException();
					break;
				}
				System.out.println("valid Input");
			}
		}
		catch( InvalidDayException e)
		{
			//System.out.println("Error"+e);
		}
		catch( InvalidMonthException e)
		{
			//System.out.println("Error"+e);
		}
		catch( NullPointerException e)
		{
			System.out.println("Error"+e);
		}
	}
}
		
