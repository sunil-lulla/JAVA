import java.util.*;
class MultiplicationNew
{
public static void main(String[] args)
{
Scanner sin = new Scanner(System.in);
int a,b;
a=sin.nextInt();
b=sin.nextInt();
int temp=0;
for(;b>0;b--)
{
temp+=a;
}
System.out.print(temp);
}
}