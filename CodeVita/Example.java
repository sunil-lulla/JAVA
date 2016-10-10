import java.util.*;
strictfp class Example
{
public static void main(String args[])
{
int a=0;
Scanner sin= new Scanner(System.in);
while(true)
{
try
{
a=sin.nextInt();
}
catch(InputMismatchException e)
{
System.out.print("Invalid Input");
continue;
}
if(a<0)
{
System.out.print("-ve");
continue;
}
int sum=0;
while(a>0)
{

sum+=a%10;
a/=10;
}
System.out.print(sum);
break;
}
}
}