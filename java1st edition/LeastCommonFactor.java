import java.util.Scanner;
class LeastCommonFactor
{
public static void main(String args[])
{
Scanner sin=new Scanner(System.in);
int n1=sin.nextInt();
int n2=sin.nextInt();
int n3=sin.nextInt();
for(int i=1;i<=n1*n2*n3;i++)
{

if(i%n1==0 && i%n2==0 && i%n3==0)
{
System.out.println("this is it"+i);
break;

}
}



}

}