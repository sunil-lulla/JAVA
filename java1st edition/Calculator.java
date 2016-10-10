import java.util.Scanner;
import java.io.PrintStream;
strictfp class Calculator
{
public  int factorial(int n)
{
int fact=1;   
for(;n>=2;n--)
fact=fact*n;
return fact;
}

public String prime(int n)
{
int i;
for( i=2;i<n;i++)
{
if(n%i==0)
break;
}
if(n==i)
return "prime";
else

return "not prime";
}

public String armStrong(int n)
{
int on=n;
int temp=0;
for(;n>0;n=n/10)
{
temp=temp+(n%10)*(n%10)*(n%10);
}
 if(temp==on)
    return "yes its an armstrong no";

else
    return "not an armstrong no";
}


public String evenOdd(int n)
{

if(n%2==0)
return "even";
else
return "odd";

}

public void table(int n)
{
int i=0;
while(i++<11)
System.out.println(n+" * "+i+"   = "+(n*i));
}



public void power(int n1,int n2)
{
int temp=1;
for(int i=1;i<=n2;i++)
temp=temp*n1;
System.out.println(n1+" raise to the power "+n2+" is: "+temp);






}

public strictfp static void main(String[] args)
{
PrintStream p=System.out;
p.println("-----------------------------this is my calculator----------------------------");
p.println(String.format("\t\t\t\t%c 1=Factorial    \n\t\t\t\t%<c 2=ArmStrong    \n\t\t\t\t%<c 3=PrimeNumber   \n\t\t\t\t%<c 4=Table \n\t\t\t\t%<c 5=Power \n\t\t\t\t%<c 6=EvenOdd \n\t\t\t\t%<c 7=Exit ",4));
p.println("Enter your choice... we are waiting for your response");
Scanner s=new Scanner(System.in);
int choice=s.nextInt();
Calculator c=new Calculator();
int num=0,num2=0;
switch(choice)
{

case 1:
             p.println("enter no for calculating its factorial");
             num=s.nextInt();
             System.out.println(c.factorial(num));
            
             break;


case 2:
             p.println("enter no for checking arm strong or not");
             num=s.nextInt();
             p.println(c.armStrong(num));
             break;


case 3:      
             p.println("enter no for prime to be checked");
             num=s.nextInt();
             p.println(c.prime(num));
             break;


case 4:
             p.println("enter no whose table u want");
             num=s.nextInt();
             c.table(num);
             break;


case 5:
             System.out.println("enter any number for power");
             num=s.nextInt();
             System.out.println("enter its power");
             num2=s.nextInt();
             c.power(num,num2);
             break;


case 6:      
             p.println("enter no for checking even or not");
             num=s.nextInt();
             p.println(c.evenOdd(num));
             break;
case 7:
             System.out.println("thanx for using our calculator...\n bye bye..");
             System.exit(0);
             break;


default:
             p.println("wrong choice");



}

p.close();



}



}   