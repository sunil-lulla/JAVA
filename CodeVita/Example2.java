import java.util.*;
class Example2
{
public static void main(String[] args)
{


int a=new Scanner(System.in).nextInt();
long sum=1;
while(a>0)
{

sum*=(a%10);
a/=10;
}
System.out.print(sum);






}
}