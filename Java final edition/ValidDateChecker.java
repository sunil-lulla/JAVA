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


}
}