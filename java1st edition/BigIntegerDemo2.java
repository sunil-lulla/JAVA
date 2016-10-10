import java.util.Scanner;
import java.util.InputMismatchException;
import java.math.BigInteger;
class BigIntegerDemo2
{
public static void main(String[] args)
{
//a+b
Scanner s=new Scanner(System.in);

System.out.print("Enter value for a:");
try
{
BigInteger a=BigInteger.valueOf(s.nextInt());

System.out.print("enter value for b:");
BigInteger b=BigInteger.valueOf(s.nextInt());
BigInteger c=a.add(b);
System.out.println("Sum is"+c);
}
catch(Exception a)
{

System.out.println(a.getMessage());
a.printStackTrace();



}

}



}