import java.io.*;
class MonthDetail
{
public static void main(String[] args) throws IOException
{

BufferedReader buf= new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter the month");
int month=Integer.parseInt(buf.readLine());
System.out.println("Enter the year");
int year=Integer.parseInt(buf.readLine());
int days=0;
String mname=" ";
switch(month)
{
case 1:
	days=31;
	mname="jan";
	break;

case 2:
	days=28;
	mname="feb";
	break;
	
case 3:
	days=31;
	mname="mar";
	break;
case 4:
	days=30;
	mname="apr";
	break;
case 5:
	days=31;
	mname="may";
	break;
case 6:
	days=30;
	mname="june";
	break;

case 7:
	days=31;
	mname="july";
	break;

case 8:
	days=31;
	mname="aug";
	break;

case 9:
	days=30;
	mname="Sept";
	break;

case 10:
	days=31;
	mname="Oct";
	break;
case 11:
	days=30;
	mname="Nov";
	break;

case 12:
	days=30;
	mname="dec";
	break;

}



if((year%100!=0&&year%4==0)||year%400==0)
{
days+=1;
}
System.out.println("the entered month is"+mname + year+" had "+days+" days");



}
}