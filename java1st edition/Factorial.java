import java.util.Scanner;
class Factorial
{
public static void main(String args[])
{


System.out.println("enter any number");
Scanner sin=new Scanner(System.in);
int a=sin.nextInt();

int f=1;
a=++a;
while(a-->0+1)
{

f=f*a;

}

System.out.println("facrtorial is:"+f);
}

}