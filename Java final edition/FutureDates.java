import java.io.*;
class FutureDates
{
public static void main(String[] args) throws IOException
{
int choice=0;
BufferedReader buf= new BufferedReader(new InputStreamReader(System.in));
System.out.print("enter todays day");
int tod=Integer.parseInt(buf.readLine(),10);
System.out.print("no of days elapsed");
int elapsed=Integer.parseInt(buf.readLine(),10);
choice=tod;
for(int i=1;i<=2;i++)
{
switch(choice)
{
case 0:
	System.out.println("Sunday");
	break;
case 1:
	System.out.println("Monday");
	break;
case 2:
	System.out.println("Tuesday");
	break;
case 3:
	System.out.println("Wednesday");
	break;
case 4:
	System.out.println("Thursday");
	break;
case 5:
	System.out.println("Friday");
	break;
case 6:
	System.out.println("Saturday");
	break;

}

elapsed=(tod+elapsed)%7;
choice=elapsed;

}


}
}