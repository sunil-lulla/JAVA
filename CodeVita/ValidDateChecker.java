import java.util.*;
import java.io.*;
class ValidDateChecker
{
public static void main(String[] args) throws IOException
{
BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
System.out.print("enter the date in mm/dd/yyyy");
StringTokenizer a= new StringTokenizer(br.readLine(),"/",false);
int date=0,month=0,year=0;
while(a.hasMoreTokens())
{

try{
 date=Integer.parseInt(a.nextToken());
 month=Integer.parseInt(a.nextToken());	
 year=Integer.parseInt(a.nextToken());
}
catch(Exception e)
{
System.out.print("Invalid Input");
System.exit(0);
}
}
boolean isInvalid=false;
if(date>31||month>12||year<1850||year>2050||date<1||month<1)
	isInvalid=true;
if(month==6||month==4||month==9||month==11)
	{
	if(date==31)
		{
		isInvalid=true;
		}
	}

if(month==2)
{
	if(date>29)
		isInvalid=true;
	
if(year%400==0||year%4==0)
{
	if(date!=29)
		isInvalid=true;

	else
		isInvalid=false;
}


}



if(isInvalid==true)
	System.out.print("INVALID DATE");

else
	System.out.print("VALID DATE");






}
}