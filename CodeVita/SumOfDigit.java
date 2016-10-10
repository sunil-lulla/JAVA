import java.util.*;
class SumOfDigit
{
public static void main(String[] args)
{
Scanner sin= new Scanner(System.in);
int a=0;
try{
 a=sin.nextInt();
}
catch(InputMismatchException e)
{
System.out.print("Invalid Input");
System.exit(0);
}
if(a<0)
{
System.out.print("negative values are not allowed");
System.exit(0);		
}
int sum=0;
for(;a>0;a/=10)
sum+=a%10;
System.out.print(sum);
}
}