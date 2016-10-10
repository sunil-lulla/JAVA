import java.util.*;
class AnotherProgram
{
public static void main(String[] args)
{
Scanner sin= new Scanner(System.in);
int num=0;
try
{
num=sin.nextInt();
}
catch(InputMismatchException e)
{System.out.print("INvalid Input");
System.exit(0);}
int j=1;
int sum=0;
while(num>0)
{
sum+=num%10*j;
j*=2;
if(num%10!=0&&num%10!=1)
{
System.out.print("this is not a binary number");
System.exit(0);
}
num/=10;
}

System.out.print(sum);




}
}