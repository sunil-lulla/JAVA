import java.text.DateFormatSymbols;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;
class FirstDayOFWeekDemo
{
public static void main(String[] args)
{
String[] months=new DateFormatSymbols(Locale.ENGLISH).getWeekdays();
for(String a:months)
System.out.println(a);
}
}