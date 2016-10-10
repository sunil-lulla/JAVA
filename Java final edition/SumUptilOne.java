import java.util.*;
class SumUptilOne
{
public static void main(String[] args)
{
Scanner sin = new Scanner(System.in);
int a=sin.nextInt(10);
int sum=0;
System.out.print(a+"->");
for(;a/10!=0;)
{
sum=0;
while(a>0)
{
sum+=a%10;
a/=10;
}
System.out.print(sum+"->");
a=sum;
}
}
}