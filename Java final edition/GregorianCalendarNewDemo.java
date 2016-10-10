import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Calendar;
class GregorianCalendarNewDemo
{
public static void main(String[] args)
{
GregorianCalendar a= new GregorianCalendar(2012,Calendar.NOVEMBER,26);
System.out.println(a.get(Calendar.MONTH));
a.set(Calendar.MONTH,Calendar.JANUARY);
System.out.println(a.get(Calendar.MONTH));
a.add(Calendar.MONTH,3);
System.out.println(a.get(Calendar.MONTH));
a.set(2013,Calendar.MAY,9);
System.out.print(a.get(Calendar.YEAR));
System.out.print(a.get(Calendar.MONTH));
System.out.print(a.get(Calendar.DAY_OF_MONTH));
Date time=a.getTime();
System.out.print(time);
time= new Date(9999999999990L);
a.setTime(time);
time=a.getTime();
System.out.print(time);





}
}