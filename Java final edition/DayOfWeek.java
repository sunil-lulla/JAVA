import java.util.Scanner;
class DayOfWeek
{
public static void main(String[] args)
{
System.out.println("Enter date dd/mm/yy");
Scanner sin= new Scanner(System.in);
String date=sin.nextLine();
sin=new Scanner(date).useDelimiter("/");
int d=sin.nextInt();
int m=sin.nextInt();
int y=sin.nextInt();
System.out.println(Math.rint(2.1));

if(y<1||m<1||m>12||d<1||d>31)
{
System.out.println("Invalid Input");
System.exit(0);
}
int h=(d+(26*(m+1)/10)+(5*(y%100)/4+21*(y/100)/4))%7;
System.out.println(h);
switch(h)
{
case 0:
	System.out.println("Satutday ");
	break;	
case 1:
	System.out.println("Sunday ");
	break;	
case 2:
	System.out.println("Monday");
	break;	
case 3:
	System.out.println("Tuesday");
	break;	
case 4:
	System.out.println("Wednesday");
	break;	
case 5:
	System.out.println("Thuraday ");
	break;	
case 6:
	System.out.println("Friday");
	break;	






}

}
}