import java.util.GregorianCalendar;
import java.util.Calendar;
import java.util.Locale;
import java.text.DateFormatSymbols;
class Gregory
{
public static void main(String[] args)
{
GregorianCalendar a= new GregorianCalendar();
int today =a.get(Calendar.DAY_OF_MONTH);
int today2 =a.get(Calendar.DAY_OF_MONTH);
int month =a.get(Calendar.MONTH);
String[] weekday=new DateFormatSymbols().getShortWeekdays();
int weekd=a.get(Calendar.DAY_OF_WEEK);
int space=0;
while(weekd!=1)
{
++space;
weekd-=1;
}
for(String ak:weekday)
System.out.printf("%4s",ak);

System.out.println();

for(int i=0;i<space;i++)
System.out.print("    ");

weekd=a.get(Calendar.DAY_OF_WEEK);
a.set(Calendar.DAY_OF_MONTH,1);


int day;
while(a.get(Calendar.DAY_OF_MONTH)!=30)
{

day=a.get(Calendar.DAY_OF_MONTH);
System.out.printf("%3d",day);
if(today==day)
System.out.print("*");
else
System.out.printf("  ");
a.add(Calendar.DAY_OF_MONTH,1);
if(7==day)



}









}
}