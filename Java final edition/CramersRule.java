import java.util.Scanner;
class CramersRule
{
public static void main(String[] args)
{
Scanner sin= new Scanner(System.in);
System.out.println("Enter value of a1,b1 & c1");
float a1=sin.nextFloat();
float b1=sin.nextFloat();
float c1=sin.nextFloat();

System.out.println("Enter value of a2,b2 & c2");
float a2=sin.nextFloat();
float b2=sin.nextFloat();
float c2=sin.nextFloat();

//a1x+b1y=c1
//a2x+b2y=c2
float x=(b1*c2-c1*b2)/(a1*b2-a2*b1);
float y=(a1*c2-a2*c1)/(a1*b2-a2*b1);
System.out.println(x+" "+y);
}
}