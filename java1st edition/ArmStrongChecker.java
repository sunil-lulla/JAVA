import java.util.Scanner;
class ArmStrongChecker
{
public static void main(String args[])
{
System.out.println("enter any number");
Scanner sin=new Scanner(System.in);
int num=sin.nextInt();
int onum=num;
int temp=0;
for(;num>0;num/=10)
{

temp=temp+(num%10)*(num%10)*(num%10);
}
if(temp==onum)
System.out.println("armstrong");
else
System.out.println("no");


}


}