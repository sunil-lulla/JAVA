import java.util.Scanner;
class PrimeNos
{
public static void main(String args[])
{
System.out.println("enter any number");
Scanner sin=new Scanner(System.in);
int n=sin.nextInt();
int i;
sam:
for( i=2;i<n;i++)
{
if(n%i==0)
break sam;
}
if(i==n)
System.out.println("prime");
else
System.out.println(" not prime");
}
}