import java.util.GregorianCalendar;
import java.util.Calendar;
class AccessorOfGregorian
{
public static void main(String[] args)
{
GregorianCalendar a= new GregorianCalendar();
System.out.print(a.get(Calendar.DAY_OF_WEEK)+"\tsam");
System.out.print(a.get(Calendar.MONTH)+"\t");
a.add(Calendar.MONTH,3);
System.out.print(a.get(Calendar.MONTH));


}
}