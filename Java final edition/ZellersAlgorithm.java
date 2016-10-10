import java.util.Scanner;
/**
this is algorithm developed by christian zeller to compute day of week
*/
class ZellersAlgorithm
{
public boolean isValid(int d,int m,int y)
{

if(d<1||d>31||m<1||m>12||y<1)
return false;

if(m==4||m==6||m==9||m==11)
{
if(d==31)
	return false;
}
if((y%100!=0&&y%4==0)||y%400==0)
{
if(d==29)
return false;
}
return true;
}
public static void main(String[] args)
{
Scanner sin= new Scanner(System.in);
sin=new Scanner(sin.nextLine()).useDelimiter("/");
int d=sin.nextInt();
int m=sin.nextInt();
int y=sin.nextInt();
int h=0;
if(new ZellersAlgorithm().isValid(d,m,y))
{
h=(int)((d+((26*(m+1))/10)+(5*(y%100)/4)+(21*(y/100)/4))%7);
System.out.println(h);
String day=null;
switch(h)
{
case 0:
	day="Saturday";
	break;
case 1:
	day="Sunday";
break;	
case 2:
	day="Monday";
break;
case 3:
	day="Tuesday";
	break;
case 4:
	day="Wednesday";
	break;
case 5:
	day="Thursday";
	break;
case 6:
	day="Friday";
	break;
}
System.out.println(day);

}


}
}