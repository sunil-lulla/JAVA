import java.util.*;
class MyProgram
{
public static void main(String[] args)
{
Scanner sin = new Scanner(System.in);
int a=sin.nextInt();
int count =0;
a*=a<0?-1:1;
do
{
a/=10;
count++;
}
while(a>0);
System.out.print(count);
}
}
