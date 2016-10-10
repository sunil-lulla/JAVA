import java.util.GregorianCalendar;
import java.util.Calendar;
class DateD
{
public static void main(String[] args)
{
GregorianCalendar a= new GregorianCalendar();
System.out.println(a.get(Calendar.MONTH));
System.out.println(a.get(Calendar.DAY_OF_MONTH));
a.add(Calendar.DAY_OF_MONTH,-29);
System.out.println(a.get(Calendar.MONTH));
System.out.println(a.get(Calendar.DAY_OF_MONTH));




}
}