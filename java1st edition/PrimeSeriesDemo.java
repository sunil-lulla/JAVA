import java.util.Scanner;
class PrimeSeriesDemo
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("--------------------------Prime Number--------------------------------");
System.out.println("enter starting series number");
int num2=s.nextInt();
System.out.println("enter ending series number");

int num=s.nextInt();
int i,j;
int count=0;
for(i=num2;i<=num;i++)
{
sam:
for(j=2;j<i;j++)
{
if(i%j==0)
break;
}
if(i==j)
{
System.out.println(j+"prime");
count++;
}
else
System.out.println(i+"not a prime");
}

System.out.println("total prime no between"+num2+"to"+num+" is"+count);
}


}