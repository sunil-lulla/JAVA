import java.util.Scanner;
class SumAndAverage
{
public static void main(String[] args)
{
Scanner sin= new Scanner(System.in);
int a=0;
int sum=0;
for(int i=0;i<10;i++)
{
System.out.print("enter the number");
a=sin.nextInt();
if(a<0)
{
System.out.print("plz enter any +ve value");
continue;
}
sum+=a;
}
System.out.print(sum);
System.out.print("avg:"+(sum/(float)10));
}
}