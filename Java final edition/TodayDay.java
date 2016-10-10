import java.text.*;
import java.util.*;
class TodayDay
{
public static void main(String[] args)
{
		
	GregorianCalendar a= new GregorianCalendar();
	int today = a.get(Calendar.DAY_OF_MONTH);
	int month=a.get(Calendar.MONTH);		
a.set(Calendar.DAY_OF_MONTH,1);
	int firstDayOfMonth=a.get(Calendar.DAY_OF_WEEK);
	String[] weekdays= new DateFormatSymbols	                (Locale.ENGLISH).getShortWeekdays();
	int k=1;
	int indent=0;
	int weekday=0;
	while(firstDayOfMonth!=k)
	{
	++indent;
	++k;	
	}

	for(String wd:weekdays)
	System.out.format("%4s",wd);
	System.out.println();
	for(int i=1;i<=indent+1;i++)
	System.out.print("    ");
	int day=0;
	while(day!=30)
	{
	 day=a.get(Calendar.DAY_OF_MONTH);
	 System.out.printf("%3d",day);
	 if(day==today)
	 System.out.print("*");
else
	 System.out.print(" ");
	 a.add(Calendar.DAY_OF_MONTH,1);						weekday=a.get(Calendar.DAY_OF_WEEK);				
	if(weekday==Calendar.SATURDAY)
	System.out.println();
	


	}



}
}