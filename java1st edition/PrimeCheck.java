import java.util.Scanner;
class PrimeCheck
{
public static void main(String args[])
{

Scanner sin=new Scanner(System.in);
int num=sin.nextInt();
int i;
for( i=2;i<num;i++)
{
if(num%i==0)
break;
}
if(num==i)
System.out.println("PRIME");
else
System.out.println("not a prime");
}


}