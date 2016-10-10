import java.util.Locale;
import java.util.GregorianCalendar;
import java.util.Calendar;
class LocaleDemo
{
public static void main(String[] args)
{
GregorianCalendar a= new GregorianCalendar(Locale.JAPANESE);
System.out.print(a.get(Calendar.MONTH));
System.out.print(a.get(Calendar.YEAR));
System.out.print(a.get(Calendar.DAY_OF_MONTH));
}
}