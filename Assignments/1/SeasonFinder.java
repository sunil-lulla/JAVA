import java.util.Calendar;
class SeasonFinder
{
public static void main(String[] args)
{
System.out.print("The season is ");
switch(Calendar.getInstance().get(Calendar.MONTH))
{
case 10:
case 11:
case 0:
case 1:
	System.out.println("Winter");
	break;

case 2:
case 3:
case 4:
case 5:
	System.out.println("Summer");
	break;


case 6:
case 7:
case 8:
case 9:
	System.out.println("rainy");
	break;

}

}
}