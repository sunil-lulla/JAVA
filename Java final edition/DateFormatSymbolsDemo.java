import java.text.DateFormatSymbols;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;
class DateFormatSymbolsDemo
{
public static void main(String[] args)
{

GregorianCalendar a= new GregorianCalendar();
String[] weekdays=new DateFormatSymbols(Locale.ENGLISH).getWeekdays();
int daynum;
daynum=a.get(Calendar.DAY_OF_WEEK);
int first=a.getFirstDayOfWeek();
do
{
System.out.format("%8s",weekdays[daynum]);
a.add(Calendar.DAY_OF_WEEK,1);
daynum=a.get(Calendar.DAY_OF_WEEK);
}
while(daynum != first);



}
}