import java.util.*;
class ExceptionDemo
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
try{
float a=s.nextFloat();
int b=s.nextInt();
float c=a/b;
System.out.println("sum is"+a/b);
}
catch(ArithmeticException e)
{
System.out.println("enter int ");
}


catch(InputMismatchException e)
{
System.out.println("enter int ");
}


}

}