import java.util.Scanner;
class ArmStrongDemo
{
public static void main(String args[])
{
Scanner sin=new Scanner(System.in);
System.out.println("enter any  number");
int num=sin.nextInt();

int onum=num;
int temp=0;
for(;num>0;num/=10)
{
temp=temp+(num%10)*(num%10)*(num%10);

}

if(onum==temp)
System.out.println("armstrong");

}




}