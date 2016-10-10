import java.util.Scanner;
import java.util.InputMismatchException;
import java.io.PrintStream;
import java.util.Formatter;
strictfp class DemoException
{
public strictfp static void main(String args\u005b\u005d)
{
Formatter fout=new Formatter();
fout.format("enter any numbers ");
Scanner s=new Scanner(System.in);
PrintStream a=System.out;
//int k=8;
//a.println(String.format("%d",k));

int a1=0,b=0;
try
{ 
a1=s.nextInt();
 b=s.nextInt();
int c=a1+b;
System.out.println(c);
}
catch(Exception r)
{

a.println("wrng input");
}
//catch(InputMismatchException r)
//{

//a.println("wrng input");
//}


a.println(a1);
}


}