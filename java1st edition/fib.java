import java.util.Scanner;
class Fib
{
public static void main(String ar[])
{

Scanner s=new Scanner(System.in);
int a,b;
a=s.nextInt();
b=s.nextInt();
int i=0;
while(i++<10)
{
int temp;
temp=a+b;
System.out.println("\n"+temp);
a=b;
b=temp;
}


}


}