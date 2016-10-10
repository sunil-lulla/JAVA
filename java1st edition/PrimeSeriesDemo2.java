import java.util.Scanner;
class PrimeSeriesDemo2
{
public static void main(String args[])
{
Scanner sin=new Scanner(System.in);
System.out.println("enter final series");
int ser=sin.nextInt();
int i,j;
for(i=1;i<=ser;i++)
{
for(j=2;j<i;j++)
{
if(i%j==0)
break;
}
if(i==j)
System.out.println(i+"prime");
else
System.out.println(i+"not prime");


}




}



}